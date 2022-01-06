package saurabh_geekster;

public class program_accept_args {
    public static void arg(int... a){
        System.out.println("total args enter by the user in function "+a.length );
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        arg(23,4,5,6,7,8,34,23,4);
    }
}
