//Write a functions which takes 2 numbers and returns the greater of those two.

import java.util.Scanner;


public class GreaterNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
