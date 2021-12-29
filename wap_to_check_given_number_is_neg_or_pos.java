package saurabh_geekster;

import java.util.Scanner;

public class wap_to_check_given_number_is_neg_or_pos {
    public static String neg_or_pos(int n){
        String a;
        if(n<0){
            a="number is negative";
        }
        else{
            a="number is positive";
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            int n= sc.nextInt();

            System.out.println(neg_or_pos(n));
            System.out.println("if you want to continue press 1");
            ch=sc.nextInt();
        }while (ch==1);
    }
}
