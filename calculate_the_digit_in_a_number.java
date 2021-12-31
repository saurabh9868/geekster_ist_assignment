package saurabh_geekster;

import java.util.Scanner;

public class calculate_the_digit_in_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count =0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
