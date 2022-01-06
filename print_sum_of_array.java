package saurabh_geekster;

import java.util.Scanner;

public class print_sum_of_array {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int mark[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            mark[i]= sc.nextInt();
        }
        System.out.println(sum(mark));
    }
}
