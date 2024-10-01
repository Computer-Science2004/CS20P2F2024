package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mathtutor {
	

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
		
	int num1 =(int)(10*Math.random()+1);
    int num2 =(int)(10*Math.random()+1);
	int operation =(int)(4*Math.random()+1);
	
	int answer=num1+num2;
	if (operation==1) {{System.out.print ("What is " + num1 + " + " + num2 + ": ");
    answer = input.nextInt();}
    if (answer==num1+num2) { System.out.print ("Correct"); }
    else if (answer!=(num1+num2)) { System.out.print ("Incorrect. The correct answer was " + (num1+num2)); }}
    
    int answer1=num1-num2;
	if (operation==2) {{System.out.print ("What is " + num1 + " - " + num2 + ": ");
    answer1 = input.nextInt();}
    if (answer1==num1-num2) { System.out.print ("Correct"); }
    else if (answer1!=(num1-num2)) { System.out.print ("Incorrect. The correct answer was " + (num1-num2)); }}
    
    int answer2=num1*num2;
	if (operation==3) {{System.out.print ("What is " + num1 + " * " + num2 + ": ");
    answer2 = input.nextInt();}
    if (answer2==num1*num2) { System.out.print ("Correct"); }
    else if (answer2!=(num1*num2)) { System.out.print ("Incorrect. The correct answer was " + (num1*num2)); }}
    
    int answer3=(num1/num2);
    int answer4=(num1%num2);
	if (operation==4) {{System.out.print ("What is the whole number " + num1 + " / " + num2 + "(no decimal's or remainder): ");
	answer3 = input.nextInt();}
    if (answer3!=num1/num2) { System.out.print ("Incorrect. The correct answer was " + (num1/num2)); }
	
    	if (answer3==(num1/num2)) { System.out.print ("Now What is the Remainder of " + num1 + " / " + num2 + ": "); }
	}
	
	
	answer4 = input.nextInt();
		if (answer4!=num1%num2) { System.out.print ("Incorrect. The correct answer was " + (num1%num2)); }
		else if (answer4==num1%num2) { System.out.print ("Correct"); }
	
	
}

}
