package saurabh_geekster;

public class find_local_minima {
    public static void main(String[] args) {
        int arr[] ={9, 6, 3, 14, 5, 7, 4};
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i+1]>arr[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            else  if(i==arr.length-1){
                if(arr[i-1]>arr[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
