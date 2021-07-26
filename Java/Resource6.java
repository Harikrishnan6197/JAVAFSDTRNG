package com.ust.examples;
interface Emp{
	int eid = 2101;
	void getEid();
	
}
class Lmplclass implements Emp{
	public void getEid() {
		System.out.println("Employee id is "+eid);
	}
}
public class Resource6 {

	public static void main(String[] args) {
		Lmplclass ob = new Lmplclass();
		ob.getEid();

	}

}
