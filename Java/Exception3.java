package com.ust.examples;

public class Exception3 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Inside Block1");
				int b =45/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception E1");
			}
			try {
				System.out.println("Inside Block2");
				int b =45/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception e2");
			}
			System.out.println("just another statement");
		}
		catch(ArithmeticException e3) {
			System.out.println("ArithemeticException");
			System.out.println("Inside parent try catch block");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutofBoundsExxception");
			System.out.println("Inside parent try catch block");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement..");
	}

}
