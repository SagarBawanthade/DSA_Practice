package Searching;

class MinimumNoToMakeBouqets {
    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));   
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k > n) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while(low < high){
            int mid = low + (high-low)/2;
            if(isPossible(bloomDay, m, k, mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
        
    }

    private static boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int count = 0;
        int bouquet = 0;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                count++;
                if(count == k){
                    bouquet++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return bouquet >= m;
    }
    
}