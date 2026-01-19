class SortedAndRotatedArray{
    public static boolean check(int[] nums) {
        int count = 0;

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }

        if(count > 1) return false;
        else if(count == 0) return true;
        else return (nums[nums.length-1] <= nums[0]);
      
        }

    public static void main(String[] args){
        int[] nums = {3,4,5,1};
        boolean res = check(nums);
        System.out.println(res);

    }
}
