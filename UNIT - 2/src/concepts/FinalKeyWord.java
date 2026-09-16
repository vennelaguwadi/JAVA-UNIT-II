package concepts;

class Bank
{
	final double minbal = 1000.00;
	final void showMinBal()
	{
		System.out.println("Mimimum balance: "+minbal);
	
	}
}
class SBI extends Bank
{
	/*void showMinBal()
	{
		super.minbal = 500;
		System.out.println("Mimimum balance: "+super.minbal);
	
	}*/
	void showSbi()
	{
		System.out.println("Thsi is sbi");
	}
	
}

final class RBI
{
	void rules()
	{
		System.out.println("Rbi values");
	}
}
/*class HDFC extends RBI
  {
  
   }
 */
public class FinalKeyWord {

	public static void main(String[] args) {
		SBI s = new SBI();
		s.showMinBal();
		s.showSbi();
		
		RBI r = new RBI();
		r.rules();
		
	}

}
