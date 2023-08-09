//Write a program to identify if the number is Armstrong number or not
public class Day19 {
    public static void main(String[] args) {
        int number = 153;
        int originalNum = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
