package saurabh_geekster;

public class wap_string_has_all_unique_charcter {
    public static void main(String[] args) {
        String b="abcdefgh";
        int arr[]=new int[26];
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            arr[ch-'a']++;
        }
        boolean is_unique=true;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>1){
                is_unique=false;
                break;
            }
        }
        System.out.println(is_unique);
    }
}
