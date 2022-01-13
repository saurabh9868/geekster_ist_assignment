package saurabh_geekster;

import java.util.Scanner;

public class Number_of_words_in{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your string");
        String s= sc.nextLine();
        int count=0;
        count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
