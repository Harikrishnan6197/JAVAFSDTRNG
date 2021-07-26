package com.ust.examples;
  enum Dire{
	East,
	West,
	North,
	South
}
public class Fexample2 {
Dire dir;
 Fexample2(Dire dir) {
	this.dir = dir;
}
 public void getMyDirection() {
	 switch (dir){
	 case East :
	 System.out.println("Directions: East");
		 break;
		 
	 case West :
		 System.out.println("Directions:West");
			 break;
			 
	 case North :
		 System.out.println("Directions: North");
			 break;
			 
	 case South :
		 System.out.println("Directions: South");
			 break;
	 }
 }
	public static void main(String[] args) {
	
		Fexample2 obj1 = new Fexample2(Dire.East);
		obj1.getMyDirection();
		
		Fexample2 obj2 = new Fexample2(Dire.South);
		obj2.getMyDirection();
		

	}

}
