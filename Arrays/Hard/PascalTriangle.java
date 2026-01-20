package Hard;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

   public static List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> anslist = new ArrayList<>();
        ArrayList<Integer> prevlist = new ArrayList<>();

        for(int row = 0; row < numRows; row++){
            ArrayList<Integer> currlist = new ArrayList<>();
            currlist.add(1);

            if(row >= 2){
                for(int j = 1; j <= row-1; j++){
                    currlist.add(prevlist.get(j) + prevlist.get(j-1));
                }
            }

            if(row > 0){
                currlist.add(1);
            }

            anslist.add(currlist);
            prevlist = currlist;
        }

        return anslist;
    }
    
}
