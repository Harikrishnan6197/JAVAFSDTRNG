package com.ust.examples;

public class Bases {
	final void foo(int i) {}
	// over loading is allowed
	void foo(int i, String s) {}
	
	class Child extends Bases{
		void foo(int i,String s) {}
		void foo1 (int i) {}
		
	}

	public static void main(String[] args) {
       Bases b = new Bases();
       
       b.foo(5, "Hari");
       b.foo(23);
	}

}
