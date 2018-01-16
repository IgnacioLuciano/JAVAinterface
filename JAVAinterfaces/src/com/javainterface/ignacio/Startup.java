package com.javainterface.ignacio;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal dog = new Dog();
		dog.speak();
		dog.run();
		dog.eat();
		
		Mammal cat = new Cat();
		cat.speak();
		cat.run();
		cat.eat();
	
		Mammal cow = new Cow();
		cow.speak();
		cow.run();
		cow.eat();
		
		
	}

}
