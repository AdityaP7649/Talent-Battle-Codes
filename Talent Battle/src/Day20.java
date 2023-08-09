//Write a program to identify if the number is Prime number or not
public class Day20 {
    public static void main(String[] args) {
        Day20 obj = new Day20();
        obj.isprime(5);
    }
    public void isprime(int no) {
        int pr = 0, count = 0;
        while (no != 0) {
            for (int i = 1; i <= no; i++) {
                pr = no % i;
                if (pr == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}




