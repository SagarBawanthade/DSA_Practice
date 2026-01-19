import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println(result);
    }   

    public static int subarraySum(int[] nums, int k) {

         HashMap<Integer, Integer> map = new HashMap<>();

        int sumTillNow = 0;
        int count = 0;

        map.put(0, 1); 

        for (int i = 0; i < nums.length; i++) {

            sumTillNow = sumTillNow + nums[i];
            int need = sumTillNow - k;

            if (map.containsKey(need)) {
                int add = map.get(need);
                count = count + add;
            }

            map.put(sumTillNow, map.getOrDefault(sumTillNow, 0) + 1);

        }

        return count;



        
        // int count = 0;
        // int n = nums.length;
       

        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
    }
}



