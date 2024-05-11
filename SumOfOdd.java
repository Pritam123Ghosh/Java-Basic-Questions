//Write a function to print the sum of all odd numbers 1 to n.

import java.util.*;


public class SumOfOdd {
    public static int SumOfOddNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i=i+2) {
                sum = sum + i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int printTheSum = SumOfOddNum(n);
        System.out.println(printTheSum);
    }
}
