import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter a number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double usingDouble = (double)number1 /  (double)number2;
        int modulus = number1 %  number2;
        

        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        // System.out.println(usingDouble); // prints 2.5

        System.out.println(number1 + " /  " + number2 + " = " + usingDouble);
        System.out.println(number1 + " %  " + number2 + " = " + modulus);

    }
}