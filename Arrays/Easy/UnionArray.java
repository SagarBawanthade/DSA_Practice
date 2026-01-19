import java.util.Arrays;

class UnionArray {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 4, 5};
        int nums2[] = {1,2,7};

        int[] res = unionArray(nums1 , nums2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        

        while ( i < nums1.length && j < nums2.length) {

            int value = 0;

            if (nums1[i] == nums2[j]) {
                
                value = nums1[i];
                i++;
                j++;
             
            } else if (nums1[i] < nums2[j]) {
                value = nums1[i];
               
                i++;
            } else {
                value = nums2[j];
            
                j++;
            }

            //duplicate check 
            if(k == 0 || ans[k-1] != value){
                ans[k] = value;
                k++;
            }

            while ( i < nums1.length){
                if(k == 0 || ans[k-1] != nums1[i]){
                ans[k] = nums1[i]  ;
                k++;
            }
            i++;
            }



            while ( j < nums2.length){
                if(k == 0 || ans[k-1] != nums2[j]){
                ans[k] = nums2[j];
                k++;
            }
            j++;
            }
        }     
        
        
        return Arrays.copyOf(ans, k);
    }
} 