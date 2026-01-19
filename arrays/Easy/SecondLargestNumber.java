class SecondLargestNumber{
    public static int secondLargestNumber(int[] arr){
        int largest = arr[0];
        int secondlargest = -1;

        for(int i = 1; i<arr.length;i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(secondlargest < arr[i]&& arr[i] < largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;

    }
    public static void main(String[] args){
        int[] nums = {1,2,10};
        int res = secondLargestNumber( nums);
        System.out.println("Seond Largest Element in Array:- " + res);

    }
}

