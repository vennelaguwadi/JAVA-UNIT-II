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
class Puppy extends Dog
{
	int age;
	void display()
	{
		System.out.println("puppy age: "+age);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.display();
		p.bark();
		p.eat();
		

	}

}
