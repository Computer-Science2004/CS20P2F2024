package test;

import java.util.Scanner;

public class test {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num1 = s.nextInt();
	     

	        int sum = 0;

	        for (int i = 1; i <= num1; i += 2) {
	            sum = sum + i;
	        }

	        System.out.print(sum);
	    }
	}

