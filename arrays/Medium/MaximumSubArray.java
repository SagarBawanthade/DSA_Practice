class MaximumSubArray{
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxSum = nums[0];

        int i = 0;
        int j = 0;

        
        while(j < nums.length){
            sum += nums[j];
            
            maxSum = Math.max(maxSum, nums[j]);
            if(sum < 0){
                sum = 0;
                i = j + 1 ;
            }else{
                if(sum > maxSum){
                    maxSum = sum;
                }
                
               
            }

            j++;

        }


        return maxSum;

        
    }
}