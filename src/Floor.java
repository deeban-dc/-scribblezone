public class Floor {
        public static void main(String[] args){
            int[] arr = {-18, -9, -3, 0, 6, 13, 55, 121, 322, };

            int target = 1;
            int ans = floor(arr, target);
            System.out.println(ans);
        }
        ////BINARY SEARCH ALGORITHM FOR ASCENDING SORTED ARRAY
        static int floor(int[] arr , int target){
            int start = 0;
            int end = arr.length- 1;

            while (start <= end){
                int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return mid;
                }

                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return end;
        }
    }
