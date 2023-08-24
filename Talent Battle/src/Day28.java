//Write a Program to reverse a string.
public class Day28 {
    public static void main(String[] args) {
        String str = "Aditya";
        char rev = ' ';
        for (int i = str.length()-1; i >= 0; i--) {
             rev =  str.charAt(i);
             System.out.print(rev);
        }
    }
}
