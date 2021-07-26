package com.ust.examples;


class Animal{
    String Name;
    public void eat() {
    	System.out.println("i can eat");
    }
}

class Dog extends Animal{
	public void display() {
		System.out.println("my name is"+ Name);
	}
}
public class Example28 {

	public static void main(String[] args) {
Dog labrador = new Dog();

labrador.Name = "rocky";
labrador.display();
labrador.eat();

	}

}
