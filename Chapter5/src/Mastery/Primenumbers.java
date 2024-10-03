package Mastery;

import java.util.Scanner;

public class Primenumbers {

	public class Prime {

		
		static Scanner Scan = new Scanner (System.in);
		
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        System.out.println("Welcome to Prime!\nPlease enter a number:");
	       
	        int number = Scan.nextInt();
	        System.out.println(number);

	        if (number%1 == number && number%number == 1) {
	            System.out.println(number + " is a prime num");
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
