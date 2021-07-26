package com.ust.examples;
enum Dires{
	East("E"),
	West("W"),
	North("N"),
	South("S");

private final String shortCode;
Dires (String code){
	this.shortCode = code;
}
public String getDirectionCode() {
	return this.shortCode;
}
}
public class Fexample3 {

	public static void main(String[] args) {
	Dires dir = Dires.South;
	System.out.println(dir.getDirectionCode());
	Dires dir2 = Dires.North;
	System.out.println(dir2.getDirectionCode());
	
	}

}
