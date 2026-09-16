package concepts;

class Animal1
{
	int age = 40;
	void eat()
	{
		System.out.println("Animal age: "+age);
		System.out.println("aniaml can eat");
	}
}
class Dog1 extends Animal1
{
	
}
class Puppy1 extends Animal1
{

}


public class HeirarchialInheritance {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.eat();
		Puppy1 p = new Puppy1();
		p.eat();
	}

}
