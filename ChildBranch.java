package Date2372020;

class Bank{
	public double totalAmount;
	public Bank(double amt) {
		this.totalAmount=amt;
	}
}

interface BankFunction {
	public double increment(double amt);
	public double decrement(double dec);
}

public class  ChildBranch extends Bank implements BankFunction{
	double totalAmt=0.0;
	public ChildBranch(double amt) {
		super(amt);
		this.totalAmt=amt;
	}
	
	public double increment(double amt) {
		totalAmt+=amt;
		return totalAmt;
		
	}
	
	public double decrement(double dec) {
		totalAmt-=dec;
		return totalAmt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildBranch cb=new ChildBranch(10000.0);
		System.out.println("Your total amount is "+cb.totalAmt);
		cb.increment(1000.0);
		System.out.println("Your new total amount is "+cb.totalAmt);
		cb.decrement(6000.0);
		System.out.println("Your new total amount is "+cb.totalAmt);
	}

}


