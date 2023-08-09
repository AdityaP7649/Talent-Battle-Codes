//Write a program to find ASCII values of a character
public class Day3 {
    public static void main(String[] args) {
        String alphabets = "abcdjfre";
        for (int i = 0; i < alphabets.length(); i++) {
            char ch = alphabets.charAt(i);
            System.out.println("ASCII value of " + ch + " is - " + (int) ch);
        }
    }
}