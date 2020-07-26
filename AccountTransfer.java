package Date2372020;

public class AccountTransfer {

	public String id;
	public String name;
	public int balance=0;
	public AccountTransfer(String id,String n) {
		this.id=id;
		this.name=n;
	}
	
	public AccountTransfer(String id,String n,int bal) {
		this.id=id;
		this.name=n;
		this.balance=bal;
	}
	
	public int credit(int amt) {
		balance+=amt;
		return balance;
	}
	
	public void debit(int amt) {
		if(amt<=balance) {
			balance-=amt;
			System.out.println("Your balance is "+balance);
		}else {
			System.out.println("amount not insufficent");
		}
	}
	
	public void transferTo(AccountTransfer another,int amt) {
			if(amt<=balance) {
				balance-=amt;
				another.credit(amt);
			}else {
				System.out.println("amount exceed!");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountTransfer u1=new AccountTransfer("u1", "Aung Aung",10000);
		AccountTransfer u2=new AccountTransfer("u2", "Maung Maung", 1000000);
		System.out.println("Aung Aung's initial balance is "+u1.balance);
		System.out.println("Maung Maung's initial balance is "+u2.balance);
		System.out.println("Transfer Balance from Maung Maung to Aung Aung is 100000.\n");
		
		u2.transferTo(u1,100000);
		System.out.println("Aung Aung's balance is "+u1.balance);
		System.out.println("Maung Maung's balance is "+u2.balance);
	}

}
