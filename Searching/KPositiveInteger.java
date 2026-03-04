package Searching;

public class KPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k){
         int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return left + k;
    

    } 
    
}
