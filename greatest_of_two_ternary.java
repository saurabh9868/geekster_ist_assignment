package saurabh_geekster;

import java.util.Scanner;

public class greatest_of_two_ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int result=(a>b)? a:b;
        System.out.println(result);
    }
}
