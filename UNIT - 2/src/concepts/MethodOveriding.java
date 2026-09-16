package concepts;

class Animal7
{
	void sound()
	{
		System.out.println("Aniaml Sounds");
	}
}
class Dog7 extends Animal7
{
	void sound()
	{
		System.out.println("Dog barkss");
	}
	
}
class Cat extends Animal7
{
	void sound()
	{
		System.out.println("cat sounds like meowwww");
	}
	
}
class Cow extends Animal7
{
	void sound()
	{
		System.out.println("cow mooo");
	}
	
}

public class MethodOveriding {

	public static void main(String[] args) {
		Animal7 a;//upcasting
		a = new Dog7();
		a.sound();
		a = new Cat();
		a.sound();
		a = new Cow();
		a.sound();
		
		
		
	}

}