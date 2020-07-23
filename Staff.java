package Date2372020;

public class Staff extends Person{

	String school;
	double pay;
	
	public Staff(String name,String address,String s,double p) {
		super(name,address);
		this.school=s;
		this.pay=p;
	}
	
	public void show() {
		System.out.println("Staff Name:\t"+name);
		System.out.println("Address:\t"+address);
		System.out.println("School:\t\t"+school);
		System.out.println("Pay:\t\t"+pay);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staff s=new Staff("K S K K", "Yangon", "MHSU", 600000.0);
		s.show();
		
		Staff s1=new Staff("P K P K","Yangon","PKPK", 650000.0);
		s1.show();
	}

}
