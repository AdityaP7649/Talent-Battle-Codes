//Write a Program to calculate the Frequency of characters in a string
/*public class Day37 {
    public static void main(String[] args) {
        /* Take a string input
        run a for loop
        take the first character
        check if the character has occurred again
        if yes count++ and cancel the character from the string so it would not be counted again
    }
}*/

import java.util.Scanner;
public class Day37
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] frequency = new int[str.length()];
        int i, j;
        char strnew[] = str.toCharArray();
        for(i = 0; i <str.length(); i++) {
            frequency[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(strnew[i] == strnew[j]) {
                    frequency[i]++;
                    strnew[j] = '0';
                }
            }
        }
        System.out.println("Frequencies: ");
        for(i = 0; i <frequency.length; i++) {
            if(strnew[i] != ' ' && strnew[i] != '0')
                System.out.println(strnew[i] + " - " + frequency[i]);
        }
    }
}
