//Write a program to identify if the character is an alphabet or not.
import java.util.Scanner;
public class Day2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter Letter :");
        String letter = sc.nextLine();
        letter = letter.toLowerCase();
        if(letter.equals("0")|| letter.equals("1") || letter.equals("2") || letter.equals("3") || letter.equals("4") || letter.equals("5") || letter.equals("6")||letter.equals("7")||letter.equals("8")||letter.equals("9")){
            System.out.println("Not an alphabet");
        }
        else {
            System.out.println("Alphabet");
        }

    }
}
