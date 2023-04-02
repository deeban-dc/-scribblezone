public class LinearSearch_Basic_ {
    public static void main(String[] args) {
        int[] nums = {557, 947, 880, 659, 788, 204, 335, 130};
        int target = 204;
        int ans = linearsearchinarray(nums,target);
        System.out.println(ans);
    }
    static int linearsearchinarray(int[] nums, int target) {
        if(nums.length==0) return -1;

        //loop
        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
