package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Election {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the election results for the following candidates in New York:");
     
		System.out.println("\nAwbrey: ");
		double Awbreyny = userInput.nextInt();
		
		System.out.println("Martinez: ");
		double Martinezny = userInput.nextInt();
		
		
		
		System.out.print("\nPlease enter the election results for the following candidates in New Jersey: ");
	     
		System.out.println("Awbrey: ");
		double Awbreynj = userInput.nextInt();
		
		System.out.println("Martinez: ");
		double Martineznj = userInput.nextInt();
		
		
		
		
		System.out.print("\nPlease enter the election results for the following candidates in Connecticut:");
	     
		System.out.println("Awbrey: ");
		double Awbreyc = userInput.nextInt();
		
		System.out.println("Martinez: ");
		double Martinezc = userInput.nextInt();
		
		
		
		
		
		double Martineztotal = Martinezc + Martineznj + Martinezny;
		
		double Awbreytotal = Awbreyc + Awbreynj + Awbreyny;
		
		double totalvotes = Martineztotal + Awbreytotal;
		
		double Awbreypercent = (Awbreytotal*100)/totalvotes;
		
		double Martinezpercent = (Martineztotal*100)/totalvotes;
		
		 DecimalFormat Awbreypercentf = new DecimalFormat("#.00");

		 DecimalFormat Martinezpercentf = new DecimalFormat("#.00");
		
		System.out.print("Awbrey's total votes were: " + Awbreytotal);
		System.out.print("\nAwbrey's percent of the votes were " + (Awbreypercentf.format(Awbreypercent)) + "%");
		
		System.out.print("\n\nMartinez's total votes were: " + Martineztotal);
		System.out.print("\nMartinez's percent of the vots were " + (Martinezpercentf.format(Martinezpercent)) + "%");
		
	}
		
	}