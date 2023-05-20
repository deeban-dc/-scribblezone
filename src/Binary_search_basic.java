public class Binary_search_basic {
    public static void main(String[] args){
        int[] arr = {-18, -9, -3, 0, 6, 13, 55, 121, 322, 1233, 12323, 64343};

        int target = 6;
//        int ans = BinarySearchacending(arr, target);
//        System.out.println(ans);
    }
         ////BINARY SEARCH ALGORITHM FOR ASCENDING SORTED ARRAY
    static int BinarySearchacending(int[] arr , int target){
        int start = 0;
        int end = arr.length- 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
          //BINARY SEARCH ALGORITHM FOR DESCENDING SORTED ARRAY
    static int BinarySearchdescending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(target < arr[mid]){
                start = mid + 1;
            } else if (target > arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }



}
