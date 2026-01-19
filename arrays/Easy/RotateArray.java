import java.util.Arrays;

class RotateArray{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] res = rotate(nums,k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] rotate(int[] nums , int k){
        int n = nums.length;
        

        while(k-- > 0){
            int temp = nums[n-1];
            for(int i = n -1; i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }

    return nums;
}
}
