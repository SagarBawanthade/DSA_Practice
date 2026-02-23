package Searching;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int result = findPeakElement(nums); 
        System.out.println("The peak element is: " + result);
    }
    public static int findPeakElement(int[] nums) {

        
        if (nums.length == 1) return 0;
        int n = nums.length;

        int left = 1;
        int right = n-2;

        //edge cases
            if(nums[0] > nums[1]) return 0;
            if(nums[n-1] > nums[n-2]) return n-1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            
            
            if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
                return mid;
            }else if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        return left;
    }
}