package com.ust.examples;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int divideByZero = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithemeticException ="+e.getMessage());
		}
finally {
	System.out.println("This is final block");
}
		
	}

}
