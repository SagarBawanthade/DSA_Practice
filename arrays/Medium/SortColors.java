import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        
    }    


    public static void sortColors(int[] arr) {

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;  
                }
            }
        }

       

       System.out.println(Arrays.toString(arr));
    }
}

