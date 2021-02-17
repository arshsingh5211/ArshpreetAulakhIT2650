// Java program to determine if a year is a leap year 

import java.util.Scanner;  //Needed for Scanner object

public class Leapyear {
   public static void main(String[] args) {
      int year;    // holds a year

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      // Get the year
      System.out.print("Please enter a year : ");
      year = console.nextInt();
      isItALeapYear(year);
   }
   
   // Determine whether the year is leap year (in a method).
      public static boolean isItALeapYear (int year) {
          System.out.print("\nYou entered " + year + " and the year " + year); 
          if (year % 4 == 0) {
              System.out.print(" is a leap year.");
              return true;
          }
          else System.out.print(" is NOT a leap year.");
                return false;
      }
}