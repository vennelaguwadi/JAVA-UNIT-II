package concepts;

abstract class Bank1
{
	abstract void calculateInterest();
	void display()
	{
		System.out.println("This is bank");
	}
	
}
class SBI1 extends Bank1
{
	void calculateInterest()
	{
		System.out.println("SBI interst rateis 2445.6");
	}
}
class HDFC extends Bank1
{
	void calculateInterest()
	{
		System.out.println("HDFC interst rateis 245.6");
	}
	
}
class ICICI extends Bank1
{
	void calculateInterest()
	{
		System.out.println("ICICI interst rateis 2.6");
	}
         
}
public class Abstract {
	public static void main(String[] args)
	{
		Bank1 b ;
		b = new SBI1();
		b.calculateInterest();
		b = new HDFC();
		b.calculateInterest();
		b = new ICICI();
		b.calculateInterest();
		/* SBI s = new SBI();
		   s.calculateInterest(); 
		   
		   HDFC H = new HDFC();
		   H.calculateInterest();
		   
		   ICICI i = new ICICI();
		   i.calculateInterest();
		 */
		
	}

}
