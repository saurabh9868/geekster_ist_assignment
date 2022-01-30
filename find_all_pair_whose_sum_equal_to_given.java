package saurabh_geekster;

public class find_all_pair_whose_sum_equal_to_given {
    public static void main(String[] args) {
        int arr[]={2,4,6,-4,0,-2,2};
        int target=4;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i]+arr[j] ==target) {
                    System.out.println(arr[i] + " at the position " + i+" and "+arr[j]+" at position "+j);
                }
            }
        }
    }
}
