package com.ust.examples;
// nested innerclass
public class Resourse0 {
class inner{
	public void show() {
		System.out.println("in a nested class method");
		
	}
}
	public static void main(String[] args) {
	 Resourse0.inner in = new Resourse0().new inner();
	 in.show();

	}

}
