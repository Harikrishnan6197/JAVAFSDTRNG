package com.ust.examples;
class A{
	public void print_a() {System.out.println("class A");}
}
class B extends A{
	public void print_b() {System.out.println("class B");}
}
class C extends A{
	public void print_c() {System.out.println("class C");}
}
class D extends A{
	public void print_d() {System.out.println("class D");}
}
public class Example30 {

	public static void main(String[] args) {
B obj_B = new B();
obj_B.print_a();
obj_B.print_b();

C obj_C = new C();
obj_C.print_a();
obj_C.print_c();

D obj_D = new D();
obj_D.print_a();
obj_D.print_d();
	}

}
