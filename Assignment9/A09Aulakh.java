//package IT2650.A09;

//calculate area of rectangle using class in java

import java.io.*;
import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
	    
	     // Create object of Rectangle class
	 
	     System.out.println("A09 - Written by Arshpreet Aulakh\n");
	     
	     System.out.println("-------------------------------------");
	     
	     Scanner console = new Scanner(System.in);
	
	     // Input Strings
	     String len = null, wid=null;
	     int l = 0, w = 0;
	     // ^^I'm not sure what this is for
	 
	     // Remove Comment to Create the Rectangle
	     Rectangle rect = new Rectangle(0, 0);
	
	     // Begin while() loop here
	     boolean run = true;
	     while (run) {
	    	 System.out.print("Please enter length of the rectangle (or 'x' to end): ");
	    	 	String consoleLength = console.next();
	    	 if (consoleLength.equalsIgnoreCase("x")) {
	    	     System.out.println("\n\nProgram Terminated by User");
	    	     break;
	    	 }
	    	 else {
	    		 rect.setLength(Integer.parseInt(consoleLength));
	    		 System.out.print("\n\nPlease enter width of the rectangle: ");
	    		 String consoleWidth = console.next();
	    		 rect.setWidth(Integer.parseInt(consoleWidth));
	    		 System.out.println("\n\nArea = " + rect.getArea());
	    	     System.out.println("-------------------------------------");
	    	 }
	     }
	     System.out.println("\nBye");
	 }
}
