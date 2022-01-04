package saurabh_geekster;

import java.util.Scanner;

public class do_kth_bit_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        System.out.println("enter the bit number you want to set 1");
        int bit= sc.nextInt();
        int val=(int)Math.pow(2,bit-1);
        num=num | val;
        System.out.println(num);

    }
}
