import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList { //we're gonna take 9 no's and  print as list of 3 no's
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialising
        for(int i =0 ; i < 3; i++ ){
            list.add(new ArrayList<>());
        }

        //input values
        for(int i =0; i < 3; i++){
            for(int j =0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

}
