import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListu { // INPUT TAKING
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList< >(10);
        //list.add(5);
        for(int i = 0; i< 5; i++){
            list.add(in.nextInt());
        }
        for(int i =0 ; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        //System.out.println(list);
    }
}
