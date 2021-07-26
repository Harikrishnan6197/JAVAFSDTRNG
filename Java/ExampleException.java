package com.ust.examples;
/*
 * Exception problem
 */
public class ExampleException {

	public static void main(String[] args) {
	String s = null;
	try {
		int x = 5/0;
		int a[] = new int[5];
		a[6] = 10;
		System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println("occured");
		e.printStackTrace();
	}
	}

}
