package Searching;

public class KPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k){
        int missingCount = 0;
        int currentNum = 1;

        while(true){
            if(currentNum == arr[missingCount]){
                missingCount++;
            }else{
                k--;
                if(k == 0){
                    return currentNum;
                }
            }
            currentNum++;
        }
    }
    
}
