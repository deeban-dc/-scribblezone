public class bitwise {
    public static void main(String[] args){
        int a = 17;
        //AND
//        int ans = a & 1;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(ans));
        //the lsb of the binary form is the output as the 1 in binary is 0001
        // so when doing and the least significant bit is returned

        //OR
//        int ans = a + 1;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(ans));

        //xor
//        int ans = a ^ 1;
//        int ans1 = a ^ 0;
//        int ans2 = a ^ a;
//
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(ans));
//        System.out.println(Integer.toBinaryString(ans1));
//        System.out.println(Integer.toBinaryString(ans2));

        //not
        System.out.println(Integer.toBinaryString(a));
        int ans = ~a;
        System.out.println(Integer.toBinaryString(~a));

        System.out.println(Integer.toBinaryString(17));


    }
}
