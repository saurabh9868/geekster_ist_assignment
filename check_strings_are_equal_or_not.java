package saurabh_geekster;

import java.util.Scanner;

public class check_strings_are_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String a = sc.nextLine();
        System.out.println("enter second string");
        String b = sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("not equal");
        }
        else{
            boolean is_equal=true;
            for(int i=0,j=0;i<a.length() && j<b.length();i++,j++){
                char ch1=a.charAt(i);
                char ch2=a.charAt(j);
                if(ch1!=ch2){
                    is_equal=false;
                }
            }
            if(is_equal){
                System.out.println("both are equal");
            }
            else{
                System.out.println("not equal");
            }
        }
    }
}
