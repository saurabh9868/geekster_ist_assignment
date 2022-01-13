package saurabh_geekster;

public class Wap_to_find_maximum_of_each_column {
    public static void main(String[] args) {
        int arr[][]={{11, 18, 10},
                     {80, 1, 0},
                     {20, 20, 19}};
        for(int i=0;i<arr[0].length;i++){
            int max=0;
            for(int j=0;j< arr.length;j++){
                if(max<arr[j][i])
                    max=arr[j][i];
            }
            System.out.println(max);
        }
    }
}
