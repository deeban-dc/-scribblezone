public class BinarySearchInSortedInfiniteArray {

        public static void main(String[] args) {
            int[] arr = {23, 343, 3433, 23434, 2343343, 234324324};
            int target = 343;
            System.out.println(ans(arr, target));

        }
        public static int ans(int[] arr, int target){
            int start = 0;
            int end = 1;

            while(target>arr[end]){
                int newstart = end+1;
                end = end + (end-start+1)*2 ;
                start = newstart;
            }
            return BinarySearchacending(arr, target, start, end);
        }

        public static int BinarySearchacending(int[] arr , int target, int start, int end){

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

    }





