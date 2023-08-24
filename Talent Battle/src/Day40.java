import java.util.Scanner;
//Write a Program to Replace substring in a string.
public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String input = sc.nextLine();
        System.out.print("Enter the String to be replaced from the String :");
        String toremove = sc.nextLine();
        System.out.print("Enter a String to replace :");
        String replacement = sc.nextLine();
        String str = input.replace(toremove,replacement);
        System.out.println(str);
    }
}
