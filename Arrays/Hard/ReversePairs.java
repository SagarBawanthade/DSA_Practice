package Hard;

public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
       int count = 0;

        for(int i = 0; i < nums.length; i++){
              for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > 2L * nums[j]){
                     count++;
                }
            }
        }
        return count;
    }
    
}
