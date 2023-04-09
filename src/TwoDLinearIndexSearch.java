import java.util.Arrays;

public class TwoDLinearIndexSearch {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {962, 887, 97, 87987, 87987},
                {43, 90, 998, 656, 67567},
                {5, 0, 65, 90},
                {5456, 9809, 909}
        };

        int target = 67567;
        // int[] ans = twoDlinearsearch(arr , target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(twoDmax(arr)); //for printing max in the 2D array
    }

     static int twoDmax(int[][] arr) {
        int max = Integer.MIN_VALUE;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length ; col++) {
                 if(arr[row][col] > max){
                     max = arr[row][col];
                 }
             }
         }
         return max;
     }
    static int[] twoDlinearsearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
