import java.util.Arrays;

class FirstRecusrion{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = Reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] Reverse(int[] arr ){
        int i, j;
        i = 0;
        j = arr.length - 1;

        if(i >= j){
            return arr;
        }   
        Swap(arr, i, j);
        Reverse(Arrays.copyOfRange(arr, i + 1, arr.length - 1));

       
    }     
    
    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}