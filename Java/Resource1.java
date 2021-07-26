package com.ust.examples;
// method local inner class
public class Resource1 {
	void outermethod() {
		System.out.println("Insisde OuterMethod");
		class Inner{
			void innerMethod() {
				System.out.println("Insisde innerMethod");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}

	public static void main(String[] args) {
		Resource1 outer = new Resource1();
		outer.outermethod();

	}

}
