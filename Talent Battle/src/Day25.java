//Write a program to find Area of a circleWrite a program to find Area of a circle
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle :");
        float r = sc.nextFloat();
        area = pi * r * r;
        System.out.println(area);
    }
}
