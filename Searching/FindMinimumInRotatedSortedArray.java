package Searching;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int result = findMin(arr);
        System.out.println(result);
        
    }
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > nums[high]) {
                low = mid + 1;  
            } else {
                high = mid; 
            }
        }
        
        return nums[low];   
        
        
    }
    
}
