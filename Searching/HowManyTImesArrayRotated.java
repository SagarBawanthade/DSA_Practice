package Searching;

import java.util.ArrayList;


public class HowManyTImesArrayRotated {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);    
        }
        System.out.println(findKRotation(list));
        
    }
    public static int findKRotation(ArrayList<Integer> nums) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {

        int mid = left + (right - left) / 2;
        
        if (nums.get(mid) <= nums.get(right)) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }

    }

    return left;
    
    }
    
}
