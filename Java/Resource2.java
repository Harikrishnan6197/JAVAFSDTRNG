package com.ust.examples;
// static nested class
public class Resource2 {
static class Nested_demo{
	public void my_method() {
		System.out.println("This is my nested class");
	}
}
	public static void main(String[] args) {
Resource2.Nested_demo nested =  new Resource2.Nested_demo();
nested.my_method();

	}

}
