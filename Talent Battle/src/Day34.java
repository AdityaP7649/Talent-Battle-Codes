//Write a Program to Remove brackets from an algebraic expression
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        String newstr = "";
        newstr = str.replaceAll("[(){}]","");
        System.out.println(newstr);
    }

}
