package com.ust.examples;

class TestEmployee {
	 int id;
	   String name;
	   float salary;
	   void insert(int i,String n, float s) {
		   id = i;
		   name = n;
		   salary = s;
	   }	
	   void display() {
	   System.out.println(id+" "+name+" "+salary);
			  
		   }
}

		public class Example14{	   

	public static void main(String[] args) {
		TestEmployee e2= new TestEmployee();
		TestEmployee e3= new TestEmployee();
		TestEmployee e4= new TestEmployee();
		
		e2.insert(101, "anandhu", 45000);
		e3.insert(101, "vidyuth", 35000);
		e4.insert(101, "baskar", 40000);
		
		e2.display();
		e3.display();
		e4.display();
	}

}
