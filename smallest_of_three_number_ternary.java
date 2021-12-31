package saurabh_geekster;

import java.util.Scanner;

public class smallest_of_three_number_ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("enter the second number");
        int c=sc.nextInt();
        int result=(a<b && a<c)? a:(b<c)? b:c;
        System.out.println(result);
    }
}
