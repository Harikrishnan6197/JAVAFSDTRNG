package com.ust.examples;

public class Resource5 {
	private void getValue() {
int sum = 20;
class Inner1{
	public int divisor;
    public int remainder;
    public void inner() {
    	
    	remainder = sum%divisor;
    }
    private int getDivisor() {
    	divisor = 4;
    	return divisor;
    }
    private int getRemainder() {
    	return sum%divisor;
    }
    private int getQuotient() {
    	System.out.println("inside inner class");
    	return sum/divisor;
    }
    
}
Inner1 inner = new Inner1();
System.out.println("Divisor ="+ inner.getDivisor());
System.out.println("Remainder="+ inner.getRemainder());
System.out.println("Quotient ="+ inner.getQuotient());


	}
	public static void main(String[] args) {
      Resource5  outer = new Resource5();
      outer.getValue();

	}

}
