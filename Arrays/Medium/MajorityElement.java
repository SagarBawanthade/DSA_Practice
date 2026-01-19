public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }

    public static int majorityElement(int[] nums) {

       int count = 0;                                                                                                                

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count > nums.length / 2) {
                return nums[i];
            } else {
                count = 0;
            }
        
        }

        return -1;
        
    }
}
