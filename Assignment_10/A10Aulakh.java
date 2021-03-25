//package IT2650.A10;

class Car {
	private Engine en; //aggregation (association will be passed as argument in start())

	public void start(Phone ph) {
	    en = new Engine();
		ph.connect();
		en.combust();
		System.out.println("Car has started!");
	}
}

//this is the aggregate class (whole while engine is part)
// Car Class contains ref to Engine class and has ownership of Engine
// Car can have engine but engine cannot have car (no cyclic ref)

//package IT2650.A10;

class Engine {
	
	public void combust() {   
		System.out.println("Engine is on!");
	}

}

class Phone {

	public void connect() {
		System.out.println("Phone is connected!");
	}
}

public class MyClass {

	public static void main(String[] args) {
		
		System.out.println("Assignment 10 written by Arshpreet Aulakh\n");
		Car mustang = new Car();
		Phone android = new Phone();
		
		mustang.start(android);
		
		System.out.println("\nBye!");
	}
}