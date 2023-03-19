import java.util.Arrays;
public class changing_rno_inArray_using_methods {
    public static void main(String[] args) {
        int[] rno = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20}; //roll nos of students in a classroom
        //Scenario : roll no 11 has been dropped out due to personal reasons
        //So we are going to substitute roll no 0 instead of 11.

        changerollno(rno); //calling the method to change the rno
        System.out.println(Arrays.toString(rno)); //printing the whole array with changes of 11th rno.
    }

    static void changerollno(int[] nums ) { // instead of *rno* we provide nums
        nums[10] = 0; //index 10 refers to 11th rollno
    }

}
