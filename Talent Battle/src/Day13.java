//Write a program to find Sum of N natural numbers
public class Day13 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The Sum of digits is :"+ sum);
    }
}
