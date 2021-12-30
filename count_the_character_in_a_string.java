package saurabh_geekster;

import java.util.Scanner;

public class count_the_character_in_a_string {
    public static int  count_the_character(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                count ++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(count_the_character(a));
    }
}
