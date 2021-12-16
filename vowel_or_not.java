package saurabh_geekster;

import java.util.Scanner;

public class vowel_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is not a vowel");
        }
    }
}
