package concepts;

class Animal5
{
	int age = 40;

}
class Dog5 extends Animal5
{
	int age = 30;
	void display()
	{
		System.out.println("Parent var: "+super.age);
		System.out.println("Child var: "+age);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Dog5 d = new Dog5();
		d.display();
		

	}

}
