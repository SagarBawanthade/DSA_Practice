package Searching;

public class MinShipCapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        System.out.println(shipWithinDays(weights, D));
    }

    public static int shipWithinDays(int[] weights, int days) {
       int left = 0;
        int right = 0;

        for(int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            if(calculateDays(weights, mid, days)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
        
    }

    public static boolean calculateDays(int[] weights, int capacity, int D){

        int day = 1;
        int currLoad = 0;

        for(int i = 0; i<weights.length;i++){
            if(currLoad + weights[i] > capacity){
                day++;
                currLoad = 0;
            }
            currLoad += weights[i];
        }

        return day <= D;

        

    }
    
}
