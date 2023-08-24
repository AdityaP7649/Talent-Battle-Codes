import java.util.Scanner;
//Write a Program to Count the sum of numbers in a string
public class Day35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        int sum=0;
        for (int i = 0; i < str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
                sum=sum+Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}
