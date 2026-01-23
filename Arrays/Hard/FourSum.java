
package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
      

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i+1; j < nums.length; j++) {

                if (j > i+1 && nums[j] == nums[j-1]) continue;

            int l = j + 1;
            int r = nums.length - 1;
            
            while (l < r) {
                long total = (long)nums[i] + nums[j] + nums[l] + nums[r];

                 if (total == target) {
                     result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                    l++;
                    r--;

                    // skip duplicates for l
                    while (l < r && nums[l] == nums[l - 1]) l++;

                    // skip duplicates for r
                    while (l < r && nums[r] == nums[r + 1]) r--;

                } else if (total < target) {
                    l++;
                } else {
                    r--;    
                }
                
            }
        }
        }


        return result;

        
    }
    
}
