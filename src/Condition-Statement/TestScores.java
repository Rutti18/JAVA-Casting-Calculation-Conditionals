import java.util.Scanner;

public class TestScores {

	public static void main(String args[]) {

		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 100");
	    int number = scanObj.nextInt(); 
	    
	    	if(number >= 0 && number <= 10) {
	    		System.out.println("Your grade is J  :(");

	    	}else if(number > 10 && number <= 20) {
	    		System.out.println("Your grade is I  :(");

	    	}else if (number > 20 && number <= 30) {
	    		System.out.println("Your grade is H :(");

	    	}else if(number > 30 && number <= 40) {
	    		System.out.println("Your grade is G :(");

	    	}else if(number > 40 && number <= 50) {
	    		System.out.println("Your grade is F :(");

			}else if (number > 50 && number <= 60) {
	    		System.out.println("Your grade is E :)");

			}else if (number > 60 && number <= 70) {
	    		System.out.println("Your grade is D :)");

			}else if(number > 70 && number <= 80) {
	    		System.out.println("Your grade is C :)");  

			}else if (number > 80 && number <= 90) {
	    		System.out.println("Your grade is B :)");

			}else if(number > 90 && number <= 100) {
	    		System.out.println("Your grade is A :)");
			}
	}
}
