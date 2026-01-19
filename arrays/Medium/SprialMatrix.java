import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ArrayList<Integer> list = spiralOrder(matrix);
        System.out.println(list);

    
    }


    public static ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

           
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

             

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

            
        }

        return ans;

        
    }
    
}
