package Skillbuilders;

import java.util.Scanner;

public class Numberssum {
	

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	
	System.out.print("The integers 1 to your number are:  ");
	
	for (int numbers = 1; numbers <= num; numbers += 1) {
		System.out.print(numbers + "   ");	
		sum += numbers; }
	
	System.out.println("");	
	System.out.print("The sum of these numbers is: " + sum);
	
	
	
	
	
	

}

}