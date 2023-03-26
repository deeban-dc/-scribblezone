import java.util.Arrays;

public class VarArgs {
//    public static void main(String[] args) {
//        fun("dee");
//
//    }
//    static void fun(String ...v){
//        System.out.println(Arrays.toString(v));
    public static void main(String[] args){
        multiple(6,9,"Deeban");

    }

     static void multiple(int a, int b,  String...v) {
         System.out.println(Arrays.toString(v));
    }
}
