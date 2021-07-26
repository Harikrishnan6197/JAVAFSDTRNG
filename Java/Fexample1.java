package com.ust.examples;

enum Directions{
	East,
	West,
	North,
	South
}
public class Fexample1 {
	

	public static void main(String[] args) {
		Directions dir = Directions.North;
		if(dir == Directions.East) {
			System.out.println("Directions: East");
		}
		else if(dir == Directions.West){
			System.out.println("Directions: East");
		}
		else if(dir == Directions.North) {
			System.out.println("Directions: North");
		}
	
		else{
			System.out.println("Directions: South");
		}
	}

}
