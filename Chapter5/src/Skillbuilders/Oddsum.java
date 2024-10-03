package Skillbuilders;

import java.util.Scanner;

public class Oddsum {


	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num1 = s.nextInt();
	     

	        int sum = 0;

	        for (int i = 1; i <= num1; i += 2) {
	            sum = sum + i;
	        }

	        System.out.print("The summ of the odd numbers between 1 and your number is " + sum);
	    }
	}

