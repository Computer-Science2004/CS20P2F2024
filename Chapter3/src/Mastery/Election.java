package Mastery;

import java.util.Scanner;

public class Election {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Please enter the election results for the following candidates in New York:");
     
		System.out.print("\nAwbrey: ");
		int Awbreyny = userInput.nextInt();
		
		System.out.print("\nMartinez: ");
		int Martinezny = userInput.nextInt();
		
		
		
		System.out.print("Please enter the election results for the following candidates in New Jersey:");
	     
		System.out.print("\nAwbrey: ");
		int Awbreynj = userInput.nextInt();
		
		System.out.print("\nMartinez: ");
		int Martineznj = userInput.nextInt();
		
		
		
		
		System.out.print("Please enter the election results for the following candidates in Connecticut:");
	     
		System.out.print("\nAwbrey: ");
		int Awbreyc = userInput.nextInt();
		
		System.out.print("\nMartinez: ");
		int Martinezc = userInput.nextInt();
		
		int Martineztotal = Martinezc + Martineznj + Martinezny;
		
		int Awbreytotal = Awbreyc + Awbreynj + Awbreyny;
		
		int totalvotes = Martineztotal + Awbreytotal;
		
		int Awbreypercent = (Awbreytotal*100)/totalvotes;
		
		int Martinezpercent = (Martineztotal*100)/totalvotes;
		
		System.out.printf("Awbrey's total votes were: " + Awbreytotal);
		System.out.printf("\nAwbrey had" + Awbreypercent + "% of the votes");
		
		System.out.printf("\n\nMartinez's total votes were: " + Martineztotal);
		System.out.printf("\nMartinez had" + Martinezpercent + "% of the votes");
		
	}
		
	}