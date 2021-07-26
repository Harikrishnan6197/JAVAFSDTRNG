package com.ust.examples;

public class Example23 {
String web;
Example23(String w){
	web = w;
}
Example23(Example23 ex){
	web = ex.web;
}
void disp() {
	System.out.println("constructor:"+web);
}
	public static void main(String[] args) {
Example23 ex1 = new Example23("Example of copy constructor");
Example23 ex2 = new Example23(ex1);
ex1.disp();
ex2.disp();
	}

}
