package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Project {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter how much time you spent designing your java project in minutes: ");
		double designing = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent coding your java project in minutes: ");
		double coding = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent debugging your java project in minutes: ");
		double debugging = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent testing your java project in minutes: ");
		double testing = userInput.nextInt();
		
		double totaltime = (designing + coding + debugging + testing);
		
		double designingtime = (designing*100)/totaltime;
		
		double codingtime = (coding*100)/totaltime;
		
		double debuggingtime = (debugging*100)/totaltime;
		
		double testingtime = (testing*100)/totaltime;
		
		 DecimalFormat designingtimef = new DecimalFormat("#.00");

		 DecimalFormat codingtimef = new DecimalFormat("#.00");
		 
		 DecimalFormat debuggingtimef = new DecimalFormat("#.00");
		 
		 DecimalFormat testingtimef = new DecimalFormat("#.00");
		
		System.out.print("The percent of total time you spent designing your java project was: " + (designingtimef.format(designingtime)) + "%");
		
		System.out.print("\nThe percent of total time you spent coding your java project was: " + (codingtimef.format(codingtime)) + "%");
	
		System.out.print("\nThe percent of total time you spent debbuging your java project was: " + (debuggingtimef.format(debuggingtime)) + "%");
		
		System.out.print("\nThe percent of total time you spent testing your java project was: " + (testingtimef.format(testingtime)) + "%");
	
				
	}
		
		
}
	