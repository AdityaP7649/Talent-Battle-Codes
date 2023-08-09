//Write a program to identify of the  number is positive or negative
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();
        if(no > 0){
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }
    }
}
