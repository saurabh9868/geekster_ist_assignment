package saurabh_geekster;

import java.util.Arrays;
import java.util.Scanner;

public class operation_on_arrays {
    public static int[] operation(int arr1[],int arr2[],String a) {
        int arr3[] = new int[arr1.length];
        if (arr1.length == arr2.length) {
            if (a == "+") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = (arr1[i]) + (arr2[i]);
                }
            }
            if (a == "-") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] - arr2[i];
                }
            }
            if (a == "*") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] * arr2[i];
                }
            }
            if (a == "/") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] / arr2[i];
                }
            }

        } else {
            System.out.println("can not perform operation on these arrays");
        }
        return arr3;

    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of first array");
        int first_array_size=sc.nextInt();
        int arr[]=new int[first_array_size];
        System.out.println("start filling the first array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int second_array_size=sc.nextInt();
        int arr2[]=new int[second_array_size];
        System.out.println("start filling the second array");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        //   int arr3[]=new int[arr.length];
        int arr3[]=operation(arr,arr2,"+");

        System.out.println(Arrays.toString(arr3));

    }
}
