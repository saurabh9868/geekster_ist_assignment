package saurabh_geekster;

import java.util.Scanner;

public class celcius_to_fernite_vice_versa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the temperature in fernite");
        int a= sc.nextInt();
        double b= (a-32)/1.8;

        System.out.println("celcius value of this fernite value is  "+b);
    }
}
