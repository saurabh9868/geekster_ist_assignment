package saurabh_geekster;

import java.util.Scanner;

public class first_and_last_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int last_digit=n%10;
        int first_digit=0;
        while(n>0){
            first_digit=n%10;
            n=n/10;
        }
        System.out.println("last digit is "+ last_digit+ " first digit is "+ first_digit);
        int sum=first_digit+last_digit;
        System.out.println("and their sum is "+sum);
    }
}
