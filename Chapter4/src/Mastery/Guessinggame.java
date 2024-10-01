package Mastery;

import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
		
	int randomnum =(int)(20*Math.random()+1);
	
	System.out.print("Enter a number between 1 and 20: ");
	int answer = input.nextInt();
	
	if (answer==randomnum) 
	{System.out.println("Computer's Number: " + randomnum);
	System.out.println("Player's Number: " + answer);
	System.out.println("You won!");
	}
	
	if (answer!=randomnum) 
	{System.out.println("Computer's Number: " + randomnum);
	System.out.println("Player's Number: " + answer);
	System.out.println("Better luck next time.");
	}
	
}

}