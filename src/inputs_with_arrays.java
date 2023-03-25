import java.util.Scanner;

public class inputs_with_arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
//        arr1[0] = 2002;
//        arr1[1] = 2001;
//        arr1[2] = 2003;

//        System.out.println(arr1[2] + " "+"is DC's year of birth");

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr1.length;  i++){
            arr1[i] = in.nextInt();
        }

        for(int i = 0; i < arr1.length;  i++) {
            System.out.println(arr1[i]);
        }
    }
}

//When you use arr1 without specifying an index,
// it is interpreted as a reference to the entire array object rather than a reference to an individual element of the array.
//
//The println method, when it is called with an object as an argument,
// uses the object's toString() method to produce a printable representation of the object.
// In the case of an array object, the toString() method inherited from the Object class returns a string that contains the
// memory address of the array object.
//
//So, when you use System.out.println(arr1), it prints the memory address of the array object rather than its contents,
// which appears as a garbage value.