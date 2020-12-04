//
//Daniel Elkins
//CSC 160 Computer Science 
// September 17, 2020
// Programming Exercise 4.15
//

//Allows program to receive user input
import java.util.Scanner;

public class Phone_Pad {

	public static void main(String[] args) {

	//Allows user input
	Scanner scan = new Scanner(System.in);
	
	//Asks user to input a letter
	System.out.println("Enter a letter: ");
	
	//Stores the user input as a character variable named "letter" at character index 0
	char letter = scan.next().charAt(0);

	//Converts the user's input into lower case as a character
	letter = Character.toLowerCase(letter);
	
	//Converts character variable "letter" to integer variable "number" which also converts 
	//the user's input to it's corresponding Unicode value
	int number = letter; 
	
	//Checks if number is equal to or between 97 to 99
	if (number >= 97 && number <= 99)
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 2);
	
	//Checks if number is equal to or between 100 to 102
	else if (number >= 100 && number <= 102)  
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 3);
		
	//Checks if number is equal to or between 103 to 105
	else if (number >= 103 && number <= 105)
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 4);
	
	//Checks if number is equal to or between 106 to 108
	else if (number >= 106 && number <= 108)
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 5);
	
	//Checks if number is equal to or between 109 to 111
	else if (number >= 109 && number <= 111)  
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 6);
		
	//Checks if number is equal to or between 112 to 115
	else if (number >= 112 && number <= 115)
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 7);
	
	//Checks if number is equal to or between 116 to 118
	else if (number >= 116 && number <= 118)
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 8);
	
	//Checks if number is equal to or between 119 to 122
	else if (number >= 119 && number <= 122)  
		
		//Prints out the corresponding Unicode number to the user's input character
		System.out.printf("The corresponding number is %d", 9);
	
	else 
		
		//Prints out that the user's input is invalid
		System.out.printf("%c is an invalid input", letter);
	
	
	
  }

}
