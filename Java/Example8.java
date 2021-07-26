package com.ust.examples;
/*
 * methods
 */
public class Example8 {
int x;
int y;

int calculate(int a, int b) {
	return a+b;
}

float calculate(float a, float b) {
	return a+b;
}
String calculate(String a, String b) {
	return a+b;
}
	public static void main(String[] args) {
Example8 e = new Example8();

int m = e.calculate(5,6);
float n = e.calculate(5.6f, 6.5f);
String o = e.calculate("Hello"," World");

System.out.println(m);
System.out.println(n);
System.out.println(o);

	}

}
