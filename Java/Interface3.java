package com.ust.examples;
class Student22{
	int roll;
	void getData(int p) {
		roll =p;
	}
	void Display() {
		System.out.println("Roll no is:"+roll);
	}
}
class Test22 extends Student22{
	double p1,p2;
	void putMarks(double x,double y) {
		p1 = x;
		this.p2 = y;
	}
	void ShowMarks() {
		System.out.println("test1 ="+p1);
		System.out.println("test2 ="+p2);
	}
}
interface sports{
	double weight = 50.00;
	public void ShowWeight();
}

class Results extends Test22 implements sports{
	double total;
	public void ShowWeight() {
		System.out.println("Weight ="+weight);
	}
	void DisplayAll() {
		total = p1+p2+weight;
		Display();
		ShowMarks();
		ShowWeight();
		System.out.println("The total is :"+total);
	}
}
public class Interface3 {

	public static void main(String[] args) {
		Results res = new Results();
		res.getData(101);
		res.putMarks(55.5,77.8);
		res.DisplayAll();

	}

}
