package saurabh_geekster;

public class begining_and_ending_num {
    public static void main(String[] args) {
        int n= 100;
        int first_num=0;
        int last_num=101;
        for(int i=1;i<51;i++){
            first_num=first_num+1;
            last_num=last_num-1;
            System.out.print(first_num +","+last_num +",");
        }


    }
}
