package saurabh_geekster;

import java.util.Scanner;

public class average_of_an_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        float sum=0;
        for(int j=0;j<size;j++){
            sum+=arr[j];
        }
        double average=sum/size;
        System.out.println(average);
    }
}
