import java.util.Scanner;

public class SameOrNah {
	public static void main(String args[]) {
	    System.out.println("Enter a word:");
	    Scanner scanObj = new Scanner(System.in);
	    String firstWord = scanObj.nextLine(); 

	    System.out.println("Enter another word:");
	    String secondWord = scanObj.nextLine(); 

	    if(firstWord.equalsIgnoreCase(secondWord)) { 
	    	System.out.println("The words are the same");
	    }else  {
	    	System.out.println("The words are different");
	    }
	}
}
