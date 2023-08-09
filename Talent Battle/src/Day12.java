//Write a program to find Sum of digits of a number
public class Day12 {
    public static void main(String[] args) {
        int number = 1235;
        int sum = 0;
        int numDigits = String.valueOf(number).length();
        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The Sum of digits is :"+ sum);

    }
}
