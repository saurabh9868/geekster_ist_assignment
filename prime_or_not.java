package saurabh_geekster;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        for (int i=1;i<num+1;i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
            if (count==2){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }

    }
}
