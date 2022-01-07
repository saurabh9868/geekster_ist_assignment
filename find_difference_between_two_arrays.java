package saurabh_geekster;

import java.util.Arrays;

public class find_difference_between_two_arrays {
    public static void main(String[] args) {
        int num[]={2,3,5,2,4,12,4};
        int num2[]={2,4,5,6,7,8,3};
        int arr[]=new int[num.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=num[i]-num2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
