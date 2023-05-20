public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
           int[] arr = {-18, -9, -3, 0, 6, 13, 55, 121, 322, 1233, 12323, 64343}; //asc
          //    int[] arr = {9059 , 897 , 455, 345, 222, 200, 108, 33, , 4, 0, -7};     //decs
        int target = -9;

        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        boolean IsAsc;
        if(start < end){
            IsAsc = true;
        } else IsAsc = false;

        while(start <= end){
            int mid = start + (end  - start)/2;

            if(target == arr[mid]){
                return mid; }

            if(IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
