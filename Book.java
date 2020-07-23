package Date2372020;

class Author{
	public String name;
	public String email;
	public char gender;
	
	public Author(String n,String email,char gender) {
		this.name=n;
		this.email=email;
		this.gender=gender;
	}
	public String authorInfo() {
		return "Author Name:\t "+name+"\nEmail:\t\t "+email+"\nGender:\t\t "+gender;
	}
}
public class Book extends Author{
	String name;
	double price=0.0;
	Author author;
	int qty=0;
	
	public Book(String name,Author author,double price) {
		super(author.name,author.email,author.gender);
		this.name=name;
		this.price=price;
	}
	
	public Book(String name,Author author,double price,int qty) {
		super(author.name,author.email,author.gender);
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public String BookInfo() {
		return "\nBook Name:\t"+name+"\nPrice:\t\t"+price+"\nQty:\t\t"+qty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author1=new Author("Juu", "juu@gmail.com", 'f');
		
		Book b=new Book("Wing Of Fallin Star",author1,5000.0,20);
		
		System.out.println(author1.authorInfo());
		System.out.println(b.BookInfo());
	}

}
