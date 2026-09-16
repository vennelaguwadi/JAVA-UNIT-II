package concepts;

class Aniaml6
{
	void sound()
	{
		System.out.println("Aniaml can do sounds");
	}
}
class Dog6 extends  Aniaml6
{
	void sound()
	{
		super.sound();
		System.out.println("Dog can do sounds");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog6 d = new Dog6();
         d.sound();
	}

}
