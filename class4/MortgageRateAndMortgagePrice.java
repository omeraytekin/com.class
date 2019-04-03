package com.class4;

public class MortgageRateAndMortgagePrice {
    public static void main(String[] args) {
	/*Create a Java program and store variables to store mortgage rate and mortgage price.
	 * First program should check if rate is higher than 4.5 user will not buy a house,
	 * otherwise user will consider buying.
	 * Once user decides to buy a house,
	 * if price of the house is larger than 200000 than user will take a loan, 
	 * otherwise user will pay cash.
	 */
	
   
   double ratelimit=4.9;
   double reflimit=4.5;
   int mrgPriceLmt=250000;
   int refprice=200000;
   if(ratelimit>=reflimit) {
   System.out.println("you can not buy a house");
   }else {
	   if(mrgPriceLmt>=refprice) {
		   System.out.println("you can get a loan");
	   }else {
		   System.out.println("pay cash");
	   }
   }
   
   
   
   
   
   
    	
    	
    	
	}
}
