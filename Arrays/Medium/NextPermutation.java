

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextPermutation(nums);
        
    }

    
    
    public static void nextPermutation(int[] nums) {

        int temp = -1;
        int n = nums.length;


       

        for (int i =  n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                temp = i;
                break;

            }

        }

        if(temp == -1){
            // reverse the array
            for (int i = 0; i < n / 2; i++) {
                int swap = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = swap;
            }
            System.out.println("Next Permutation: " + java.util.Arrays.toString(nums));
            return;
        }

        for (int j = n-1; j>=0; j--) {

            if(nums[j] > nums[temp]){
                int swap = nums[j];
                nums[j] = nums[temp];
                nums[temp] = swap;
                break;
            }
            
        }

        for (int i = temp + 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
            
        }

        System.out.println("Next Permutation: " + java.util.Arrays.toString(nums));
        
    }
}
