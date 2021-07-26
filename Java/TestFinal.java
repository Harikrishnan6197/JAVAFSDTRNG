package com.ust.examples;
// Final Example
  class Vehicle1{
	int x =5;
	Vehicle1(){
		System.out.println("Vehicle class constructor");
	}
	
	/*final void changeGear() {
		System.out.println("automatic variant");
	}
	*/
	void changeGear() {
		System.out.println("automatic variant");
	}
}

class Honda1 extends Vehicle1{
/*	void changeGear1() {
		System.out.println("automatic variant in subclass");
		super.changeGear();
	}
	*/
	void changeGear() {
		System.out.println("automatic variant in subclass");
}
}

public class TestFinal {

	public static void main(String[] args) {
Vehicle1 v = new Honda1();
Vehicle1 v1 = new Vehicle1();
//Honda1 h1 =  (Honda1)new Vehicle1();
//h1.changeGear();
v1.changeGear();
System.out.println(v.x);
v.changeGear();

	}

}
