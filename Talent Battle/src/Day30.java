//Write a Program to print Length of the string without using strlen() function
public class Day30 {
    public static void main(String[] args) {
        String str = "Program";
        int i=0;
        char ch[]=str.toCharArray();
        for(char c : ch)
        {
            i++;
        }
        System.out.println(i);
        {

        }
    }
}
