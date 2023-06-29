

public class BSinRecursion {
    public static void main(String[] args){
         int[] arr = {1,2,3,5,7,8,12,34};
         int target = 12;
         int ans = search(arr, target, 0 , arr.length-1);
         System.out.println(ans);
    }

    private static int search(int[] arr , int target, int start, int end) {

        if(start > end) return -1;

        int mid = start + (end-start)  / 2;

        if(arr[mid]==target) return mid;

        if(target < arr[mid]) {
            return search(arr,target,start,mid-1);
        }
            return search(arr,target, mid+1, end);
    }
}
