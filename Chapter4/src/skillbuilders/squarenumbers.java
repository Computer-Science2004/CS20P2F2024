package skillbuilders;

import java.util.Scanner;

public class squarenumbers {
	

	public static void main(String[] args)
	{
	
	
	int num, squared;
	double squareroot;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	num = input.nextInt();
	
	//take the square root if the number entered by the user
	squareroot = Math.sqrt(num);
	
	//original(user input) number to the power of 2
	squared = (int)Math.pow((int)squareroot, 2);
	
	if(num == squared)
	{
		System.out.println("The number is a perfect square ");
	}
	else
	{
		System.out.println("The number is NOT a perfect square ");
	}
}

}