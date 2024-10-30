package Skillbuilders;

public class SpanishNumbers {
	
	public static void main(String[] args) {
       
        for (int i = 1; i <= 10; i++) {
            displaySpanishNumber(i);
        }
    }

   
    public static void displaySpanishNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("1 - Uno");
                break;
            case 2:
                System.out.println("2 - Dos");
                break;
            case 3:
                System.out.println("3 - Tres");
                break;
            case 4:
                System.out.println("4 - Cuatro");
                break;
            case 5:
                System.out.println("5 - Cinco");
                break;
            case 6:
                System.out.println("6 - Seis");
                break;
            case 7:
                System.out.println("7 - Siete");
                break;
            case 8:
                System.out.println("8 - Ocho");
                break;
            case 9:
                System.out.println("9 - Nueve");
                break;
            case 10:
                System.out.println("10 - Diez");
                break;
            default:
                System.out.println("Number out of range");
                break;
        }
    }
}

