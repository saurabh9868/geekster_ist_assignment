package saurabh_geekster;

import java.util.Scanner;

public class count_the_number_in_an_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++){
            if(marks[j]==target){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println("the target is "+count+" times present in the array");
        }
        else{
            System.out.println("target value is not present in the array");
        }
    }

}
