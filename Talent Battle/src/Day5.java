
//write a program to find if the number is Odd or Even
import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();
        if(no % 2== 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
