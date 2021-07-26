package com.ust.examples;

public class Example20 {
	
	
	int x;
	float y;
	String z;
	
	Example20(){}
	Example20 (int x, float y){
		this.x = x;
		this.y = y;
	}
Example20(int x, float y, String z){
	this.x=x;
	this.y=y;
	this.z=z;
	
}
	public static void main(String[] args) {
Example20 e1 = new Example20();

System.out.print(e1.x);

Example20 e2 = new Example20(3,3.8f);

System.out.print(e2.y);

Example20 e3 = new Example20(3,3.8f,"hari");

System.out.print(e3.z);
	}

}
