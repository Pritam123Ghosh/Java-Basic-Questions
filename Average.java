//Enter 3 number from the user & make a function to print their average.

import java.util.*;

public class Average{

    public static int printAverage (int f, int g, int h){
        int avg = (f+g+h)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = printAverage(a, b, c);
        System.out.println(average);
    }
}