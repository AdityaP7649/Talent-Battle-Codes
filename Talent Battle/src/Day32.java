//Write a Program to Remove vowels from a string
/*import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char ch = ' ';
        for (int i = 0; i <str.length() ; i++) {
            ch =  str.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
            {

            }
        }
    }
}*/
import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String s1 = "";
        s1 = str.replaceAll("[aeiou]", "");
        System.out.println(s1);
    }
}

