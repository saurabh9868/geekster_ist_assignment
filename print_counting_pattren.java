package saurabh_geekster;

public class print_counting_pattren {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}

