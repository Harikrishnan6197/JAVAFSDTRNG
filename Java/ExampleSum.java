package com.ust.examples;

abstract class Sums {
/*
 *THese two are abstract method 
 *The child class must implement these method
 * 
 */
	public abstract int sumofTwo(int n1,int n2);
	public abstract int sumofThree(int n1,int n2,int n3);
	
	//regular method
	public void disp() {
		System.out.println("Method of classSum");
	}
}
// Regular class extends abstract class
class Demos extends Sums{
	
	/*
	 * if the implementation of these two methods are not done
	 * program will throw compilation error
	 * 
	 */
	
	public int sumofTwo(int num1,int num2) {
		return num1+num2;
	
	}
	public int sumofThree(int num1,int num2,int num3) {
		return num1+num2+num3;
	
	}
}

public class ExampleSum{
	public static void main(String[] args) {
		
		Sums obj = new Demos();
		System.out.println(obj.sumofTwo(8, 9));
		System.out.println(obj.sumofThree(4, 5, 12));
		obj.disp();
	}
	}


