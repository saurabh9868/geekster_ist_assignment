package saurabh_geekster;

public class pair_nearest_to_zero {
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        int min=Integer.MAX_VALUE;
        int posi=-1;
        int posj=-1;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int sum=Math.abs(arr[i]+arr[j]);
                if(sum<min){
                    min=sum;
                    posi=i;
                    posj=j;
                }
            }
        }
        System.out.println(min);
        System.out.println(arr[posi]+" both these are pair "+arr[posj]);
    }
}
