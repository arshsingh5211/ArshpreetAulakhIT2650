//package IT2650.A06;

import java.util.Scanner;

class Car {
    private String color;
	
    public Car (String color) {
        this.color = "Green";
        System.out.println("*** We are inside Car Constructor and the color from the factory is Green\n");
    }
    
    public void start () { 
        System.out.println("The Car Has Started\n");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class myClass {
	
    public static void main(String args[]) {

        System.out.println("A06 - Written by Arshpreet Aulakh\n");
        
        String consoleInput = "";
        
        Scanner console = new Scanner(System.in);
        
        Car myCar = new Car(consoleInput);
        //System.out.println(myCar.getColor()); //used this to test what the color is upon creating the car object
        
        boolean run = true;
        
        while (run) {
            System.out.print("Please enter a color (or 'x' to end): \n");
	        consoleInput = console.nextLine();
            if (consoleInput.equalsIgnoreCase("x")) {
                System.out.print("\nGoodbye!");
                break;
            }
            
	        else {
	        	myCar.setColor(consoleInput);
		        System.out.println("\nYou entered " + consoleInput + "\n");
                System.out.println("The color is now " + myCar.getColor() + "\n");
                myCar.start();	
            }
        }  
    }
}