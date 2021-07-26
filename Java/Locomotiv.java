package com.ust.examples;
/*
 * accecssing outerclass from innerclasss
 * 
 */

class Cars{
	String carName;
	String carType;
	public Cars(String name,String type) {
		this.carName = name;
		this.carType = type;
		
	}
	private String getCarName() {
		return this.carName;
	}
	class Engine{ 
		String engineType;
        void setEngine() {
        	 if (Cars.this.getCarName().equals("Chrysler")) {
        		 this.engineType = "smaller";
        		 
        	 }
        	 else {
        		 this.engineType = "Bigger";
        	 }
        	 
        }
       String getEngineType() {
    	   return this.engineType;
       }
	}
}
public class Locomotiv {

	public static void main(String[] args) {
		Cars car1 = new Cars("Mazda", "8WD");
		Cars.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine type for 8WD = "+engine.getEngineType());
		Cars car2 = new Cars("Chrysler","4WD");
		Cars.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine type for 4WD = "+c2engine.getEngineType());
	}

}
