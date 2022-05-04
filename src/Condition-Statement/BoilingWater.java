import java.util.Scanner;

public class BoilingWater {

	public static void main(String args[]) {
	    System.out.println("Enter a number greater than 212:");
	    Scanner scanObj = new Scanner(System.in);
	    int boilingPoint = scanObj.nextInt(); 

	    if(boilingPoint > 213) {
	    	System.out.println("Water is boiling!");
	    }
	
	}
}
