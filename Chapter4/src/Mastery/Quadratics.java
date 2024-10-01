package Mastery;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Quadratics {

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a value for a: ");
	int a = input.nextInt();
	
	System.out.print("Enter a value for b: ");
	int b = input.nextInt();
	
	System.out.print("Enter a value for c: ");
	int c = input.nextInt();
	
	
	double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);
	double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);
	
	DecimalFormat x1f = new DecimalFormat("#.00");
	DecimalFormat x2f = new DecimalFormat("#.00");
	
	System.out.print("The roots are " + (x1f.format(x1)) + " and " + (x2f.format(x2)));
	
}

}