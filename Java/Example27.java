package com.ust.examples;



    class CreditCards {
	
	private String CardName;
	private String expiryDate;
	private float creditBalance;
	
	CreditCards(){
		CardName = "sarmada";
		expiryDate = "2021-06-20";
		creditBalance =50000;
	}
	void checkCardBalance() {
		if(creditBalance >=40000) {
			System.out.println("Sufficient Balance");
		}
		else {
			System.out.println(" Not suffficient");

		}
	}
 }
	class Visa extends CreditCards{
		float interestRate;
		float creditLimit;
		Visa(){
			super();
		}
		
		void checkDiscounts() {
			System.out.println(" Many Discount will be provided");
		}
	}
	class Mastercard extends CreditCards{
		
		void checkPaymentoptions() {
			System.out.println(" Online payment mode is available");

		}
	}
	
public class Example27{
	public static void main(String[] args) {
     Visa v = new Visa();
     v.checkCardBalance();
     v.checkDiscounts();
	}

}
