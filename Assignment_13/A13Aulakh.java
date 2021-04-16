import java.util.Scanner;

public class Assignment13 {
    static class MyException extends Exception {
        MyException (String s) {
            super(s);
        }
    }
    
    public static void main(String[] args) {
    
        System.out.println("A13 - Written by Arshpreet Aulakh");
        
        Scanner console = new Scanner(System.in);
  
        // Input Strings
        String divisor=null, dividend=null;
        int x=0,y=0, counter=1;
    
  
        while (true) {
        
            System.out.println("\nPass " + counter++ +  "\n-----------------------------\n");
            System.out.print("Please enter the dividend (or 'x' to end): ");
            dividend = console.nextLine();
            System.out.println(dividend);
            
            if (dividend.equalsIgnoreCase("x")) {
                System.out.println("\nProgram Terminated by User"); 
                break;
            }
            
            System.out.print("\nPlease enter the divisor : ");
            divisor = console.nextLine();
            System.out.println(divisor + "\n");
            
            x=Integer.parseInt(dividend);
            y=Integer.parseInt(divisor);

            try {
                if (y == 0) {
                    throw new MyException("Attempted to divide by zero!\n");
                }
                else {
                    int quotient = x / y;
                    System.out.println(x + " / " + y + " = " + quotient + "\n");
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
            
        }

    System.out.println("\nBye");
   }
}