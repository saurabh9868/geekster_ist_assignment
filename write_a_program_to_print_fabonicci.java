package saurabh_geekster;

import java.util.Scanner;

public class write_a_program_to_print_fabonicci {
    public static int fabo(int num){
        int fabonici=0;
        if(num==0 || num==1){
            return 1;
        }
        else{
             fabonici=fabo(num-1)+fabo(num-2);
        }
        return fabonici;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fabo(num));
    }
}
