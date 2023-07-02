public class BasicsWithBitWise {
    public static void main(String[] args) {
//        int a = 18;
//        System.out.println(isOdd(a));

        int[] arr  = {2, 3, 3 ,7, 8,2,7};
        //int ans = unique(arr);
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {

//       for(int i =0; i<arr.length; i++){
//           ans = ans ^ i;
//       }
        int uniqueno =0;
        for(int n : arr){
            uniqueno ^= n;
        }
       return uniqueno;
    }

    private static boolean isOdd(int a) {
        return ((a&1)==1);
    }
}
