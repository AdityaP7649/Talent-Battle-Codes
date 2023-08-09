//Write a program to reverse a given number
public class Day14 {
    public static void main(String[] args) {
        int number = 1235;
        int rev = 0;
        int numDigits = String.valueOf(number).length();
        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;
            rev = digit;
            number = number / 10;
            System.out.print(rev);
        }

    }
}
