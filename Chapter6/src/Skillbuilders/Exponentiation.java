package Skillbuilders;

import java.util.Scanner;

public class Exponentiation  {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   
    System.out.print("Enter the base number: ");
    double base = scanner.nextDouble();

    System.out.print("Enter the exponent: ");
    double exponent = scanner.nextDouble();

   
    double result = powerOf(base, exponent);
    System.out.printf("%.2f raised to the power of %.2f is: %.2f\n", base, exponent, result);
}

public static double powerOf(double base, double exponent) {
    return Math.pow(base, exponent);
}
}
