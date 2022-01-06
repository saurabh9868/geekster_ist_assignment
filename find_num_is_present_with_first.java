package saurabh_geekster;

import java.util.Scanner;

public class find_num_is_present_with_first {
    public static int present_at_index(int num[],int n){
        int pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                pos=i;
                break;
            }

        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("enter the values");
        for(int j=0;j<10;j++){
            num[j]= sc.nextInt();
        }
        System.out.println("enter that number you want to find");
        int n=sc.nextInt();
        System.out.println(present_at_index(num,n));
    }
}
