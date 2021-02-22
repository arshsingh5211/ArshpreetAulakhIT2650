//package IT2650.A05;

import java.util.ArrayList;
import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
        System.out.println("A05 - Written by Arshpreet Aulakh"); // constraint #1
		Scanner console = new Scanner(System.in);

		// while condition to give user choice to keep running the program until the user opts out (nested while loops as per constraint #3)
        boolean run = true;
		while (run) {
			int number = getNextInt(console);
			outputThePrimeListForANumber(number, console);
			//printNumbers(number); // could use this instead of arraylist

	      	boolean makeAnotherChoice = true;
	      	while (makeAnotherChoice) {
			      	System.out.print("\nWould you like to make another selection? (Y)es or (N)o: ");
			      	String answer = console.next();
			      	if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
			      		makeAnotherChoice = false;
			      		System.out.println("\nThank you, have a great day!");
			      		System.exit(0);
			      	}
			      	else if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
			      		run = true;
			      		number = getNextInt(console);
			      		outputThePrimeListForANumber(number, console);
			      		//printNumbers(number); // could use this instead of arraylist
			      	}
			      	else System.err.println("Sorry, that is not a valid option. Please try again.");
	      	}
		}
	}
    
    // get the user-selected number from console using a method so I can more easily start the program again after user makes appropriate selection
    public static int getNextInt (Scanner console) {
		System.out.print("\nPlease enter a number between 0 and 9 : ");
		int nextInt = console.nextInt();
		return nextInt;
    }
    
    // Boolean to determine whether the number is a prime number (eventually will be used within a loop per constraint #2)
    public static boolean isThisAPrimeNumber (int numberToCheck) {
    	if (numberToCheck % 2 == 0 || numberToCheck % 3 == 0 || numberToCheck % 5 == 0 || numberToCheck % 7 == 0) {
    		return false;
    	}
    		return true;  
    }
    
	// method to get the last digit of a 2-digit positive int
	public static int findLastDigit (int n) {
		return n % 10;
	}
      
    // get an ArrayList of values that are prime numbers that end with the number the user selected
	public static ArrayList<Integer> getThePrimeList (int userChosenNumber) {
    	ArrayList<Integer> primeList = new ArrayList<Integer>();
    	for (int i = 0; i < 100; i++) {
    		if (isThisAPrimeNumber(i) == true && findLastDigit(i) == userChosenNumber) {
          		primeList.add(i);
          	}
    	}
          		return primeList;
    }
	
	// could have used this method instead of using an ArrayList but felt using a list was better organized and used a nested loop (****UNUSED METHOD****)
	public static void printNumbers(int userChosenNumber) {
        System.out.print("\nYou entered " + userChosenNumber + " and the prime numbers that end with a " + userChosenNumber + " are ");
		for (int i = 0; i < 100; i++) {
    		if (isThisAPrimeNumber(i) == true && findLastDigit(i) == userChosenNumber) {
    			System.out.print(i + " ");
          	}
    	}
		System.out.println("");
	}
	
    // method to run the program so I can use it again later in the main method 
    public static void outputThePrimeListForANumber (int userChosenNumber, Scanner console) {
		 while (!(userChosenNumber >= 0 && userChosenNumber <= 9)) {
			 System.err.println("Sorry, that is not a valid option. Please try again.");
			 userChosenNumber = getNextInt(console);
		 }
      	if (getThePrimeList(userChosenNumber).size() < 1) {
      		System.out.println("\nYou entered " + userChosenNumber + " and the prime numbers that end with a " + userChosenNumber + " are NONE"); //per constraint #4
      	}
      	else System.out.print("\nYou entered " + userChosenNumber + " and the prime numbers that end with a " + userChosenNumber + " are " + getThePrimeList(userChosenNumber).toString().replace("[", "").replace("]", "\n").replace(",", ""));
    }
}