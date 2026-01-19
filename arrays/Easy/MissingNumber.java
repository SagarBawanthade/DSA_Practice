public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {

        int res = 0;
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n * (n + 1)/2;

        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }

        res = expectedSum - actualSum;
        return res;

       
    }
}