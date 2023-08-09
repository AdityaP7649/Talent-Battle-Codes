//Write a program to find roots of a quadratic equation
public class Day8 {
    public static void main(String[] args) {
        int a=1,b=-6,c=9;
        double roots = (-b+Math.pow((Math.pow(b,2)-4*a*c),0.5) )/(2*a);
        System.out.println(roots);
    }
}
