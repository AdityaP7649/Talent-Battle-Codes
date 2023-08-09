// Write a program to Add two fractions
//Description
//Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format
//x3/y3 = (x1/y1) + (x2/y2)
//here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2
public class Day18 {
    public static void main(String[] args) {
        int x1=2,x2=3,x3;
        int y1=4,y2=3,y3;
        x3 = (x1*y2) + (x2*y1);
        y3 = (y1*y2);

        System.out.println(x3 +"/" +y3);
    }
}
