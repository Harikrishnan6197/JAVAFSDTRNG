package com.ust.examples;

public class Resource3 {
private int data = 30;
void display() {
	class Local{
		void msg() {
			System.out.println(data);
		}
	}
	Local l =new Local();
	l.msg();
	
}
	public static void main(String[] args) {
Resource3 obj = new Resource3();
obj.display();
	}

}
