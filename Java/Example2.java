package com.ust.examples;
// Depicting the usage of nested if else statement
public class Example2 {
float price;
String item;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example2 e1 = new Example2();
Example2 e2 = new Example2();
e1.price = 1.2f;
e2.price = 1.2f;
e1.item = "pen";
e2.item = "book";

if(e1.price>e2.price) {
	
	e1.item="scale";
	
}
if(e1.price<e2.price) {
	
	e1.item="pencil";
}
else if (e1.price==e2.price) {
e1.item="box";
}
System.out.println(e1.item);
	}

}
