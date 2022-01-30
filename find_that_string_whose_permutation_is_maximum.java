package saurabh_geekster;

public class find_that_string_whose_permutation_is_maximum {
    public static void main(String[] args) {
        String arr[]={"ads","dtyh","fy","rtyui"};
        int max=0;
        int pos=-1;
        for(int i=0;i< arr.length;i++){
            String s=arr[i];
            int len=s.length();
            if(max<len){
                max=len;
                pos=i;
            }
        }
        System.out.println(arr[pos]);
    }
}
