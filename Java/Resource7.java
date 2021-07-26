package com.ust.examples;
interface Emp22{
	int eid = 2012;
	void getEid();
}
public class Resource7 {

	public static void main(String[] args) {
	Emp22 ob = new Emp22() {
		public void getEid() {
			System.out.println("Employee id is "+eid);
		}
	};
ob.getEid();
	}

}
