package com.ust.examples;

public class Example21 {
	String  fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	static String b;
	Example21(String x,String y,String z,String a,String b,float c){
		fName = x;
		lName = y;
		city = z;
		address = a;
		dob =b;
		salary = c;
	}

	void display() {
		System.out.println(fName+" "+lName+" "+city+" "+address+" "+dob+" "+salary);
	}
	public static void main(String[] args) {
Example21 array[] = new Example21[5];
array[0] = new Example21("Harikrishnan","Gopalakrishnan","Thrissur","Thanikkudam","6-1-97",28000.0f);
array[1] = new Example21("Aswinkumar","Basanth","Thrissur","Madakkathara","28-12-98",30000.0f);
array[2] = new Example21("Kevin","George","Thrissur","Vadanappily","28-9-97",32000.0f);
array[3] = new Example21("Gifin","Varghese","Thrissur","Poranattukkara","1-10-1996",28000.0f);
array[4] = new Example21("Dheeraj","krishnakumar","Thrissur","mundur","25-01-1998",32000.0f);


for(int i=0;i<array.length;i++) {
	array[i].display();
}
	}

}
