package Searching;

public class BSin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }
    

    public static boolean searchMatrix(int[][] matrix, int target) {
        int l  = 0;
        int r = matrix[0].length - 1;

        int up = 0;
        int down = matrix.length - 1;

        while(up <= down){
            int mid = up + (down - up) / 2;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] > target){
                down = mid - 1;
            }
            else{
                up = mid + 1;
            }
        }
        if (down < 0) return false;
        
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(matrix[down][mid] == target) return true;
            if(matrix[down][mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
    
}
