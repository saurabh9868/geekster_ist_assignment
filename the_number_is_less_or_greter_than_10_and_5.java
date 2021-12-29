package saurabh_geekster;

import java.util.Scanner;

public class the_number_is_less_or_greter_than_10_and_5 {
    public static boolean large_or_small_than_ten(int n){
        boolean small=false;
        if(n<=10){
            small=true;
        }
        return small;
    }
    public static boolean large_or_smaller_than_five(int n){
        boolean small=false;
        if(n<=5){
            small=true;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            int n=sc.nextInt();
            if(large_or_small_than_ten(n)){
                if(large_or_smaller_than_five(n)){
                    System.out.println("number is  smaller than 10 also smaller than 5");
                }
                else{
                    System.out.println("number is only smaller than 10 not smaller than 5");
                }
            }
            else{
                System.out.println("number is greater than 10");
            }
            System.out.println("if you wanna continue enter 1");
            ch= sc.nextInt();
        }while(ch==1);

    }
}
