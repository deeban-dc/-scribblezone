
public class NoofDigits {
    public static void main(String[] args){
        int a = 2;
        int base = 2;
        System.out.println(Integer.toBinaryString(a));
        int ans = (int) ((Math.log(a)/Math.log(base))) +  1 ;
        System.out.println(ans);


    }
}
