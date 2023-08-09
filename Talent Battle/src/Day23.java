//Write a program to Replace all 0’s with 1 in a given integer
public class Day23 {
    public static void main(String[] args) {
        int number = 10010101;
        String str,replaced = "";
        str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            replaced = str.replace('0','1');
        }
        System.out.println(replaced);
    }

}
