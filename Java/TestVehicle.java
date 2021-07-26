package com.ust.examples;
// Abstract example
abstract class Vehicle{
	int x =5;
	Vehicle(){
		System.out.println("Vehicle class constructor");
	}
	abstract void run();
	void changeGear() {
		System.out.println("automatic variant");
	}
}

class Honda extends Vehicle{
	void run(){
		System.out.println("Vehicle running successfully");
	}
	void changeGear() {
		System.out.println("automatic variant in subclass");
		super.changeGear();
	}
}


public class TestVehicle {

	public static void main(String[] args) {
Vehicle v = new Honda();
System.out.println(v.x);
v.run();
v.changeGear();
	}

}
