package com.ust.examples;
interface Firstinterface{
	public void myMethod();
}
interface Secondinterface{
	public void myOtherMethod();
}
class Democlass implements Firstinterface, Secondinterface{
	public void myMethod() {
		System.out.println("some text..");
	}
	public void myOtherMethod() {
		System.out.println("some other text..");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		Democlass myObj = new Democlass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
