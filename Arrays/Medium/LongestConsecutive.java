import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Length: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }

     

        int maxCount = 0;

        int count = 0;
        

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);

        return maxCount + 1;
        
        
    }
}

