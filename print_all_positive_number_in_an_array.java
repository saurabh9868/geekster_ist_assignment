package saurabh_geekster;

import java.util.Scanner;

public class print_all_positive_number_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("enter the values");
        for(int j=0;j<10;j++) {
            num[j] = sc.nextInt();
        }
        for(int j=0;j<10;j++){
            if(num[j]>0){
                System.out.print(num[j]+" ");
            }
        }
    }
}
