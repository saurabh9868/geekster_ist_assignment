package saurabh_geekster;

import java.util.Scanner;

public class take_two_user_input_string_and_concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String a= sc.nextLine();
        System.out.println("enter second string");
        String b= sc.nextLine();
        System.out.println("after joining the strings");
        System.out.println(a+b);
    }
}
