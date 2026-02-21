package Searching;

public class RotatedArraySearchOne {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(arr, target);
        System.out.println(result);
        
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;

        while(l<=r){
            int mid = l + (r-l) /2;

            if(nums[mid] == target) return mid;

            //Left side is sorted
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target <= nums[mid]){
                    r = mid -1;
                }else{
                    l = mid +1;
                }
            }

            else{
                if(target >= nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }

           
            
        }
        return -1;
      
    }

    
}
