package com.ust.examples;
// About abstract class
abstract class Car{
	int x;
    abstract void insuranceDetails();
	void display() {}
	
}









public class Hyundai extends Car{

	void insuranceDetails() {
		System.out.println("Please provide the insurance formula here:");
	}
	
	
	public static void main(String[] args) {
		//Car c = new Car();
        Hyundai h = new Hyundai();
        Car c = new Hyundai();
       
        c.insuranceDetails();
        h.insuranceDetails();
	}

}
