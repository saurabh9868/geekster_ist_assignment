package saurabh_geekster;

import java.util.Scanner;

public class find_mid_of_array {
    public static int mid(int arr[]){
        int mid=(arr.length/2)+1;
        int mid_element=0;
        for(int i=0;i<mid;i++){
            mid_element=arr[i];
        }
        return mid_element;
    }
    public static void main(String[] args) {
        int mark[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            mark[i]= sc.nextInt();
        }
        System.out.println(mid(mark));

    }
}
