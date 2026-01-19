class SingleNumber{
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int res = singleNumber(nums);
        System.out.println("Single number is: " + res);
    }

    public static int singleNumber(int[] nums) {
        

        int singleNumber = 0;

        for(int num : nums){
            singleNumber ^= num;
        }


        return singleNumber;

        
    }
}