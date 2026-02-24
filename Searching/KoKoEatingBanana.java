package Searching;

public class KoKoEatingBanana {
    public static void main(String[] args) {
            int piles[] = {30,11,23,4,20};
            int h = 6;
            System.out.println(minEatingSpeed(piles, h));   

        
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
       

        while(low <= high){

            int mid = low + (high - low) /2;

            int totalHours = calculateHours(piles, mid);

            if(totalHours <=h ){
               
                high = mid - 1;

            }else{
                low = mid + 1;

            }
        }
        return low;

    }

    private static int calculateHours(int[] piles, int mid) {
        int hours = 0;
        for(int pile : piles){
            hours = (int) (hours + Math.ceil((double)pile / mid));
        }
        return hours;
    }

    private static int findMax(int[] piles) {
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }
        return max;
      
        
    }
}
    

