package saurabh_geekster;

import java.util.Scanner;

public class inches_to_meter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value in inches");
        double a=sc.nextInt();
        System.out.println("result in meter");
        double b=a/40;
        System.out.println(b);
    }
}
