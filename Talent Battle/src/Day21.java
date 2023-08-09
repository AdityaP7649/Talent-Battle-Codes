// Write a program to identify if the number is Palindrome or not.
public class Day21 {
    public static void main(String[] args) {
        int number = 121;
        int originalNum = number;
        int reversedNumber = 0;
        int numDigits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if(reversedNumber == originalNum)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
