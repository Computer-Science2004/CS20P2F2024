package Mastery;

import java.util.Scanner;

public class Project {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter how much time you spent designing your java project in minutes: ");
		int designing = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent coding your java project in minutes: ");
		int coding = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent debugging your java project in minutes: ");
		int debugging = userInput.nextInt();
		
		System.out.print("Please enter how much timke you spent testing your java project in minutes: ");
		int testing = userInput.nextInt();
		
		int totaltime = (designing + coding + debugging + testing);
		
		int designingtime = (designing*400)/totaltime;
		
		int codingtime = (designing*400)/totaltime;
		
		int debuggingtime = (designing*400)/totaltime;
		
		int testingtime = (designing*400)/totaltime;
		
		
		System.out.print("The percent of total time you spent designing your java project was: " + designingtime + "%");
		
		System.out.print("\nThe percent of time you spent coding your java project was: " + codingtime + "%");
		
		System.out.print("\nThe percent of time you spent debugging your java project was: " + debuggingtime + "%");
		
		System.out.print("\nThe percent of time you spent testing your java project was: " + testingtime + "%");
				
	}
		
		
}
	