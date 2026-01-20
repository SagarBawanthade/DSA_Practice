package Hard;

import java.util.*;


public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
       System.out.println(majorityElement(nums));
        
    }

     public static List<Integer> majorityElement(int[] nums) {
        int count = 0;
        int floor = nums.length / 3;
        List<Integer> list = new ArrayList<>();
       

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                count = map.get(num);
            } else {
                count = 0;
            }
            map.put(num, count + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > floor){
               list.add(key);
            }
        }

        return list;



       

        
    }
    
}
