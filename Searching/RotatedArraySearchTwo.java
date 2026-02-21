package Searching;

public class RotatedArraySearchTwo {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0;

        boolean result = search(arr, target);
        System.out.println(result);
    }

    public static boolean search(int[] nums, int target) {

        int l = 0;
        int r = nums.length -1;

        while(l<=r){
            int mid = l + (r-l) /2;

            if(nums[mid] == target) return true;

            //Left side is sorted
            if(nums[l] < nums[mid]){
                if(target >= nums[l] && target <= nums[mid]){
                    r = mid -1;
                }else{
                    l = mid +1;
                }
            }

            else if(nums[l] > nums[mid]){
                if(target >= nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }

            else{
                l++;
            }

           
            
        }
        return false;

        
    }
    
}
