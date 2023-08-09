//Write a program to find Number of days in a given month of a given year
public class Day7 {
    public static void main(String[] args) {
        int year = 2000;
        int month = 2;
        if(year % 4 ==0 && month<=12)
        {
            if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10||month == 12)
            {
                System.out.println("31");
            } else if (month == 2 ) {
                System.out.println("29");
            }
            else{
                System.out.println("30");
            }
        }
    }
}
