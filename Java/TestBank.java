package com.ust.examples;
// Abstract example.
abstract class Bank_Name{
	abstract int getInterestRate(int x);
}
class HDFC extends Bank_Name{
	int getInterestRate(int x){
		return x;
	}
}

class ICICI extends Bank_Name{
	int getInterestRate(int y){
		return y;
	}
}

public class TestBank {

	public static void main(String[] args) {
Bank_Name b = new HDFC();
System.out.println(b.getInterestRate(2));

b = new ICICI();
System.out.println(b.getInterestRate(5));
	}

}
