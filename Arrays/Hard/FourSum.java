
package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FourSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
             
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            

            int l = i + 1;
            int r = nums.length - 1;
            
            while (l < r) {
                int total = nums[i] + nums[l] + nums[r];

                 if (total == sum) {
                     result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    // skip duplicates for l
                    while (l < r && nums[l] == nums[l - 1]) l++;

                    // skip duplicates for r
                    while (l < r && nums[r] == nums[r + 1]) r--;

                } else if (total < sum) {
                    l++;
                } else {
                    r--;    
                }
                
            }
        }


        return result;

        
    }
    
}
