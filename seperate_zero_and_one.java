package saurabh_geekster;

import java.util.Arrays;

public class seperate_zero_and_one {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
