package saurabh_geekster;

import java.util.Arrays;

public class swap_two_numbers_in_array {
    public static int[] swap(int arr[],int index1,int index2){
        try{
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
        catch (Exception e){
            System.out.println("index is out of bounds so cannot swap them");
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,67,5};
        System.out.println(Arrays.toString(swap(arr,2,12)));
    }
}
