package Searching;

public class SmallestDivisor {
    public static void main(String[] args) {
       
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int result = smallestDivisor(nums, threshold);
        System.out.println("Smallest Divisor: " + result); 

    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (getSum(nums, mid) > threshold) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}