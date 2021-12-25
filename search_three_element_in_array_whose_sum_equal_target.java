package saurabh_geekster;

import java.util.Scanner;

public class search_three_element_in_array_whose_sum_equal_target {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target value");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+" at "+i+" index, "+arr[j]+" at "+j+" index, "+arr[k]+" at "+k+" index, "+"their sum is equal to target "+target);
                    }
                }
            }
        }
    }
}
