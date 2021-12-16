package saurabh_geekster;

import java.util.Scanner;

public class quadilateral_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first angle a ");
        int a= sc.nextInt();
        System.out.println("enter the second angle b ");
        int b= sc.nextInt();
        System.out.println("enter the third angle c ");
        int c= sc.nextInt();
        System.out.println("enter the fourth angle d ");
        int d= sc.nextInt();
        if (a>0 && b>0 && c>0 && d>0 && a+b+c+d==360){
            System.out.println("quadilateral");
        }
        else{
            System.out.println("not quadilateral");
        }
    }
}
