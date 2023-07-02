public class WorkspaceBitwise {
   public static void main(String[] args){

       int n = 19;
        System.out.println(Integer.toBinaryString(n));
        int i = 2;
        System.out.print(Integer.toBinaryString(n >> (i-1)&1));
    }
}
