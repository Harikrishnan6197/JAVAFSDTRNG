package com.ust.examples;
class Student{
	String name;
	int id;
	Student(String name,int id){
		this.name =  name;
		this.id = id;
	}
}

public class Example24 {

	public static void main(String[] args) {
         Student student1 = new Student("ashok",101);
         System.out.println("Student name:"+student1.name+" and Student id:"+student1.id);
	}

}
