package saurabh_geekster;

import java.util.Scanner;

public class print_all_prime_numbers_in_array {
    public static boolean prime_or_not(int num){
        int count=0;
        boolean is_prime=false;
        for (int i=1;i<num+1;i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count==2){
            is_prime=true;
        }
        else{
            is_prime=false;
        }
        return  is_prime;
    }
    public static void main(String[] args) {
        int mark[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            mark[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(prime_or_not(mark[i])){
                System.out.print(mark[i]+" ");
            }
            else{
                continue;
            }
        }
    }
}
