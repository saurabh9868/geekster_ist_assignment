package saurabh_geekster;

import java.util.Scanner;

public class concatination_of_string {
    public static String concatination_of_string(String a,String b){
        String c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        System.out.println(concatination_of_string(a,b));

    }
}
