package saurabh_geekster;

import java.util.Scanner;

public class accept_variable_length {
    public static int  print_sum(int b){
        int sum=0;
        for(int i=b;i>0;i--){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int length=0;
        while(n>0){
            n=n/10;
            length ++;
        }
        System.out.println(print_sum(length));
    }
}
