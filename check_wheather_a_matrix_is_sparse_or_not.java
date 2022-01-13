package saurabh_geekster;

public class check_wheather_a_matrix_is_sparse_or_not {
    public static boolean sparse(int arr[][]){
        boolean is_sparse=true;
        int zero=0;
        int non_zero=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0)
                    zero++;
                else
                    non_zero++;
            }
        }
        if(zero<non_zero){
            is_sparse=false;
        }
        return is_sparse;
    }
    public static void main(String[] args) {
        int arr[][]={{0, 0, 0},
                {0, 0, 0},
                {0, 0, 9}};
        System.out.println(sparse(arr));
    }
}

