package com.Inheritance;

public class Animal1 {
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog1 extends Animal1 {
	void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog{
	void weep()
	{
		System.out.println("weeping...");
	}
}
class Test9{
	


	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.bark();
b.eat();
b.weep();
	}

}
