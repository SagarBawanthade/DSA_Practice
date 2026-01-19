import java.util.Scanner;

class RemoveDuplicates{
    public static int removeDuplicate(int[] nums){
        int k = 1;


        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
        
        int res = removeDuplicate(nums);
        System.out.println(res);
    }
}

