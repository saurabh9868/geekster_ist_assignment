package saurabh_geekster;

import java.util.Scanner;

public class wap_to_convert_binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number you want to convert");
        int num= sc.nextInt();
        int base=1;
        int decimal_value=0;
        int last_digit;
        while(num>0){
            last_digit=num%10;
            num=num/10;
            decimal_value+=last_digit*base;
            base=base*2;

        }
        System.out.println("value of this binary number is  "+decimal_value);
    }
}
