import java.util.HashSet;


public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }


        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
          int count = 0;
        int maxCount = 0;



        for(int x : set){
            if(!set.contains(x-1)){
                int currentNum = x;
                count = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    count += 1;
                }

                maxCount = Math.max(maxCount, count);
            }
        }
      
       
       
        

        return maxCount;
    }
}
