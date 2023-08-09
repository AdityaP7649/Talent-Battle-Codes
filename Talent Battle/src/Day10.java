//Write a program to find Factorial of a number
public class Day10 {
    public static void main(String[] args) {
        int no = 5;
        int fact = 1;
        for(int i = 1; i <= no ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
