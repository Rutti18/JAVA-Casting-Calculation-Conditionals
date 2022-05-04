import java.util.Scanner;

public class NumberComparison {
	public static void main(String args[]) {
	    System.out.println("Enter a number:");
	    Scanner scanObj = new Scanner(System.in);
	    int firstNum = scanObj.nextInt(); 
	    System.out.println("Enter another number:");
	    int secondNum = scanObj.nextInt(); 
	    if(firstNum == secondNum) {
	    	System.out.println("Numbers are the same");
	    }else if(firstNum > secondNum) {
	    	System.out.println("The first number was larger than the second");
	    }else {
	    	System.out.println("The second number was larger than the first");
	    }
	
	}
}
