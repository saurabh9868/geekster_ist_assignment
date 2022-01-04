package saurabh_geekster;

import java.util.Scanner;

public class most_signifaciant_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int count=0;
        while(num!=0){
            num=num/2;
            count++;
        }
        int val=(int)Math.pow(2,count-1);
       if((num2 & val)==val){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
