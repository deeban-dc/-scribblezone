//  DEBUG AND ALSO NEEDS TO BE UNDERSTOOD
import java.util.Arrays;
public class changesinmain {
    public static void main(String[] args) {
        int[] arr1 = {12,34,45,65,45};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
        change2(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    static void change2(int[] nums){
        nums[1] = 100;
    }
    static void change(int[] nums) {
        nums[0] = 77;
    }
}
