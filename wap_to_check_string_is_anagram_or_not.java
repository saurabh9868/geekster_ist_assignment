package saurabh_geekster;

import java.util.Arrays;

public class wap_to_check_string_is_anagram_or_not {
    public static void main(String[] args) {
        String a="aabvcd";
        String b="vadacbe";
        int arr[]=new int[26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            arr[ch-'a']--;
        }
        boolean is_anagram=true;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                is_anagram=false;
                break;
            }
        }
        System.out.println(is_anagram);
    }
}
