package concepts;

class Animal2
{
	Animal2()
	{
		System.out.println("Animal constructor called");
	}
}
class Dog2 extends Animal2
{
	Dog2()
	{
		System.out.println("Dog constructor called");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		
	}

}
