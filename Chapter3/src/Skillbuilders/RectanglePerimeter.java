package Skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a lenth value: ");
		int length = userInput.nextInt();
		
		System.out.print("Please enter a width value: ");
		int width = userInput.nextInt();

		
		int perimeter = (length * 2) + (width * 2);
		
				
		System.out.print("The perimeter of the rectangle is: "+ perimeter);
				
	}
		
		
}
