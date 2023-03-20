public class shadowing_IN_methods {
    static int x = 5; // static because of outside the main (oops)
    public static void main(String[] args){
        System.out.println(x);  // its 5 as it is declared above
        int x= 10;
        System.out.println(x); // its 10 as the value is changed now  (shadows the upper level scope)
        sample(); //even though now the value is changed, this method is taking the upper level scope
    }
    private static void sample() {
        System.out.println(x); //so this is 5
    }
}
