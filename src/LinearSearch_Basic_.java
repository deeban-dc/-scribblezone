public class LinearSearch_Basic_ {
    public static void main(String[] args) {
        int[] nums = {557, 947, 880, 659, 788, 204, 335, 130};
        int target = 204;
        int ans = linearsearchinarray(nums,target);
        System.out.println(ans);
    }
    static int linearsearchinarray(int[] arr, int target) {
        if(arr.length==0) return -1;

        //loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
