package com.ust.examples;
interface Polygon{
	void getArea(int length,int breadth);
	
}
class Rectangle implements Polygon{
	public void getArea(int length, int breadth) {
		System.out.println("the area of the rectangle is "+(length*breadth));
	}
}

public class Interface5 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();

	}

}
