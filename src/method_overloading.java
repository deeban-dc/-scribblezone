public class method_overloading {
    //two or more methods with same name can exist if the parameters are different
    public static void main(String[] args) {
        fun(12);
        fun("DC"); //at the compile time , it decides which method to run.
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
