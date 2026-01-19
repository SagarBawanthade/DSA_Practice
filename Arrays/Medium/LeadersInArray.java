import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        ArrayList leaders = leaders(nums);
        System.out.println(leaders);
    }
    public static ArrayList<Integer> leaders(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = nums.length -1; i>0;i--){
            if(nums[i] > nums[i-1]){
                list.add(nums[i]);
            }
        }

        list.add(nums[nums.length -1]);

        return list;
        
    }
}
