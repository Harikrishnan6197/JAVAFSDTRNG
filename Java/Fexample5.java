package com.ust.examples;

enum Operation{
  PLUS,
  MINUS,
  TIMES,
  DIVIDES;
	  
	  double calculate(double x, double y) {
	  switch(this) {
	  case PLUS:
		  return x + y;
	  case MINUS:
		  return x - y;
	  case TIMES:
		  return x * y;
	  case DIVIDES:
		  return x / y;  
		  default:
			  throw new AssertionError("Unknown operations"+ this);
	  }
  }
}
public class Fexample5 {

	public static void main(String[] args) {
		
       Operation op = Operation.DIVIDES;
       System.out.println(op.calculate(5.5, 6.6));
        
       
       Operation ops = Operation.TIMES;
       System.out.println(ops.calculate(5.5, 6.6));

}

}