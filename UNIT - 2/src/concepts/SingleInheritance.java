package concepts;

class Animal
{
	int age = 40;
	void eat()
	{
		System.out.println("Animal age: "+age);
		System.out.println("Animal can eat");
	}
}
class Dog extends Animal
{
	int age = 20;
	void bark()
	{
		System.out.println("Dog age: "+age);
		System.out.println("Dog can bark");
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	

	}

}
