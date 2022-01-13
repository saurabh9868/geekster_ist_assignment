package saurabh_geekster;

import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Scanner;

public class check_strings_are_isomorphic_or_not {
    public static  boolean isomorphic(String s,String t){
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Boolean> map2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1.containsKey(ch)==true){
                if(map1.get(ch)!=ch2){
                    return false;
                }
            }
            else if(map2.containsKey(ch2)==true){
                return false;
            }
            else{
                map1.put(ch,ch2);
                map2.put(ch2,true);
            }
        }
        return true;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          String t=sc.nextLine();
        System.out.println(isomorphic(s,t));
    }
}
