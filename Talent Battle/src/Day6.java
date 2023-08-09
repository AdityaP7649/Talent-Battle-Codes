//Write a program to find the Quadrants in which coordinates lie
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordinate :");
        int x = sc.nextInt();
        System.out.print("Enter y co-ordinate :");
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else {
            System.out.println("4th Quadrant");
        }
    }
}
