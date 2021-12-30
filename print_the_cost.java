package saurabh_geekster;

import java.util.Scanner;

public class print_the_cost {
    public static double print_cost(double a){
        a-=a/10;
        a=a*100;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the unit of which you want to find the cost and one unit is equal to 100");
        double a= sc.nextDouble();
        System.out.println("after 10 % discount on the cost cost will become  "+print_cost(a));
    }
}
