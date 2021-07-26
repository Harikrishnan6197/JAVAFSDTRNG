package com.ust.examples;
interface Animal22{
	public void animalSound();
	public void sleep();
}
 class Pig implements Animal22 {
	 public void animalSound() {
		 System.out.println("The pig says:wee wee");
	 }
	 public void sleep() {
		 System.out.println("Zzz");
	 }
 }
 public class Interface0{

	public static void main(String[] args) {
		Pig my_pig = new Pig();
		my_pig.animalSound();
		my_pig.sleep();

	}

}
