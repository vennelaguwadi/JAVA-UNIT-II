package concepts;

class Animal3
{
	Animal3(String name)
	{
		System.out.println("Animal construter called: "+name);
	}
}
class Dog3 extends Animal3
{
	Dog3()
	{
		super("Tiger");
		System.out.println("Dog constructror called");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Dog3 d = new Dog3();
	}
		

}
