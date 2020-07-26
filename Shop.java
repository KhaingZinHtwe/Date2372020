package Date2372020;

import java.time.LocalDate;
import java.util.Date;

class Customer{
	public String name;
	Boolean member=false;
	static String memberType;
	
	public Customer(String n,String mtype) {
		this.name=n;
		this.memberType=mtype;
	}
	
	public Boolean isMember() {
		if(memberType=="Premium"|| memberType=="Gold"||memberType=="Silver") {
			member=true;
		}
		return member;
	}
	
	public String toString() {
		return "Customer Name:\t"+name+"\nMember Type:\t"+memberType;
	}
}

class DiscountRate{
	static double serviceDiscountPremium=0.2;
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	
	static double productDiscountPremium=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	
	public double getServiceDiscountRate(String type) {
		if(type=="Gold") {
			return serviceDiscountGold;
		}else if(type=="Silver") {
			return serviceDiscountSilver;
		}else if(type=="Premium"){
			return serviceDiscountPremium;
		}else {
			return 0.0;
		}
	}
	
	public double getProductDiscountRate(String type) {
		if(type=="Gold") {
			return productDiscountGold;
		}else if(type=="Silver") {
			return productDiscountSilver;
		}else if(type=="Premium"){
			return productDiscountPremium;
		}else {
			return 0.0;
		}
	}

}
public class Shop extends DiscountRate {
	Customer customer;
	LocalDate date;
	double serviceExpense;
	double productExpense;
	
	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public Shop(Customer c,LocalDate date,double serviceExpense,double productExpense) {
		super();
		this.customer=c;
		this.date=date;
		this.serviceExpense=serviceExpense;
		this.productExpense=productExpense;
	}
	
	public double getTotalExpense() {
		if(customer.isMember()) {
			serviceExpense=serviceExpense-(serviceExpense*getServiceDiscountRate(customer.memberType));
			productExpense=productExpense-(productExpense*getProductDiscountRate(customer.memberType));
		}
		return serviceExpense+productExpense;
	}
	
	public String toString() {
		return "Customer Name:\t\t\t\t"+customer.name+"\nMember Type:\t\t\t\t"+customer.memberType+"\nDate:\t\t\t\t\t"+date+
				"\nTotal Expense withot Discount Rate:\t"+(serviceExpense+productExpense)+
				"\nDiscount Rate:\t\t\t\t"+(getServiceDiscountRate(customer.memberType)+getProductDiscountRate(customer.memberType))+
				"\nTotal expense with Discount Rate:\t"+getTotalExpense()+"\n";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Mg Mg","Gold");
		Shop s1=new Shop(c1, LocalDate.now(), 7600.0, 10000.0);
		System.out.println(s1.toString());
		
		Customer c2=new Customer("Thandar", "Silver");
		Shop s2=new Shop(c2, LocalDate.now(), 6400.0,20000.0);
		System.out.println(s2.toString());
		
		Customer c3=new Customer("Thura", "Premium");
		Shop s3=new Shop(c3, LocalDate.now(), 4500.0,1500.0);
		System.out.println(s3.toString());
	}

}
