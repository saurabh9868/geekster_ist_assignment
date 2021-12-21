package saurabh_geekster;

import java.util.Scanner;

public class count_the_target_value_in_an_array {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<10;i++){
            marks[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        int count=0;
        for(int j=0;j<10;j++){
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
