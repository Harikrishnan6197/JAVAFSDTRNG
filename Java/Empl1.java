package com.ust.examples;

 abstract class Empye{
	
	private String name;
	private int paymentPerHour;
	
	void display() {
		System.out.println("Name is"+name+"\n"+"Employee hour is"+paymentPerHour+"\n");
	}
	public Empye() {}
	public Empye(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
		
		
		public void setName(String name){
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		public void setpaymentPerHour() {
			this.paymentPerHour = paymentPerHour;
		}
		public int getpaymentPerHour() {
			return paymentPerHour;
		}
		
		
		abstract void salary(int x, int y);
 }
 
 
 public class Empl1 extends Empye{
			Empl1(){
				super();
			}
			Empl1(String name, int paymentPerHour){
				super(name, paymentPerHour);
			}
			void salary (int days,int total_sal) {
				if((total_sal/days)>500) {
					System.out.println("the payment is good");
					
				}
				else {
					System.out.println("the payment is not  good");
				}
			}
			
			
				
		

	public static void main(String[] args) {
Empl1 e1 = new Empl1("Hari",24);
e1.display();
Empl1 e2 = new Empl1();
e2.setName("Harsh");
System.out.println(e2.getName());
e2.salary(10,10000);
	}
		}
 
	
