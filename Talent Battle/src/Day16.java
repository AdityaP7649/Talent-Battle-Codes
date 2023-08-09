//Write a program to identify if the number is Perfect number or not
//Description
//Get the input from the user and check whether that number is a perfect number or not.
//E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
public class Day16 {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
                sum=sum+i;
        }
        if(sum == num)
        {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}
