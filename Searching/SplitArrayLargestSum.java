package Searching;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }

    public static int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }

        while(left < right){
            int mid = (left + right) / 2;

            if(isValid(nums, k, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean isValid(int[] nums, int k, int mid) {
        int count = 1;
        int sum = 0;

        for(int num : nums){
            sum += num;

            if(sum > mid){
                count++;
                sum = num;
            }
        }

        return count <= k;
    }

}