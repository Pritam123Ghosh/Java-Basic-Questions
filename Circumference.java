//Write a functions takes in the radius as a input and return the circumference of the circle.


import java.util.*;

public class Circumference {
    public static double CalculateCircumference(double n){
        double circumference = 2*Math.PI*n;
        return circumference;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double ans = CalculateCircumference(n);

        System.out.println(ans);
    }
}
