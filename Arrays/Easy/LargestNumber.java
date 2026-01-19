
class LargestNumber{
    public static void main(String[] args){
        int[] nums = {3,3,6,1};
        int res = largestNumber(nums);
        System.out.println("Result is:- " + res);
    }

    public static int largestNumber(int[] arr){
        
        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
