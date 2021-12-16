package saurabh_geekster;

import java.util.Scanner;

public class triangle_valid_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first angle a");
        int a= sc.nextInt();
        System.out.println("enter second angle b");
        int b= sc.nextInt();
        System.out.println("enter third angle c");
        int c= sc.nextInt();
        if(a>0 && b>0 && c>0 && a+b+c==180){
            System.out.println("this is a valid triangle");
        }
        else{
            System.out.println("this is not a valid triangle");
        }
    }
}
