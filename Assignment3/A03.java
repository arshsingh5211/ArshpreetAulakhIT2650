import java.util.Scanner;
import java.lang.Math;
public class A03 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
    }
    public static double hexagonArea(double s) {
        double hexArea = (3*Math.sqrt(3) * Math.pow(s, 2)) / 2;
        return hexArea;
    }
}