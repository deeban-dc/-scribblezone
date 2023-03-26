import java.util.Arrays;

public class varArgs_methodOverloading {
    public static void main(String[] args){
        demo("DC", "Marvel", "WB"); //this will call the string args method
        //demo(6,45,2234,435,345,345);  //this will call the int args method
    }

    private static void demo(int... v) {
        System.out.println(Arrays.toString(v));
        System.out.println("It detects the int method because the given integer input");
    }

    private static void demo(String...v) {
        System.out.println(Arrays.toString(v));
        System.out.println("It detects the String method because the given string input");
    }
}
