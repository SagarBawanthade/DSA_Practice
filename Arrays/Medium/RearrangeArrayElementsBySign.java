import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] rearranged = rearrangeArray(nums);
        System.out.println(Arrays.toString(rearranged));
    }
    

     public static int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < ans.length; i++) {
           if(nums[i] >= 0){
            ans[positiveIndex] = nums[i];
            positiveIndex += 2;

           }else{
            ans[negativeIndex] = nums[i];
            negativeIndex += 2;
           }
        }
        

        return ans;
    }
}
