import java.util.Scanner;
public class A02 {

    public static void main(String[] Strings) {

        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();
        
        System.out.println ("You entered " + min + " minutes");
        
        int year = (int)(min/525600);
        
        int day = (int)((min/1440) - (365 * year));
        
        System.out.println (min + " minutes is approximately " + year + " years and " + day + " days");


        //1440 min in a day; 365 days in a year;
        // min/525600 = year(floor)
        // min/1440=totalDays
        // totalDays - (365 * year) = remainingDays;
        // test print as 2147483649 as well as the values 4085 years and 283 days
        
    }
}