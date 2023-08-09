//Write a program to find the Factors of a number
public class Day17 {
    public static void main(String[] args) {
        int n = 28;
        int factor = 0;
        for (int i = 1; i < n ; i++) {
            if(n%i==0)
            {
                System.out.println(i);
        }
        }
    }
}
