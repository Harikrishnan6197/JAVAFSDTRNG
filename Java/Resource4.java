package com.ust.examples;
// local innerclass
public class Resource4 {
private int data = 30;
void display() {
	int value = 50;

class Locals{
void msg() {
	System.out.println(value);
}
}
Locals l = new Locals();
l.msg();
}

	public static void main(String[] args) {
     Resource4 obj  = new Resource4();
     obj.display();
	}

}
