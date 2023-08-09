//Write a program to identify if the character is a vowel or consonant.
import java.util.Scanner;
public class Day1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter Letter :");
        String letter = sc.nextLine();
        letter = letter.toLowerCase();
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}
