//Write a program to find Fibonacci series up to n
import java.util.*;
public class Day11 {
    public static void main(String[] args) {
        int n1 = 0 ,n2 = 1 , n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        System.out.println("0");
        System.out.println("1");
        for(int i = 0; i<=n ; i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
}
