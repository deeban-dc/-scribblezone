import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,-4,3,-2,1,0};
        //bubblesort(arr);
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr) {
        boolean swapped;
        for(int i = 0; i<arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(swapped == true) break;
        }
    }

    public static void selectionsort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = getmaxIndex(arr, 0, last );
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getmaxIndex(int[] arr, int start,int end) {
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[i] > arr[max] ){
                max = i;
            }
        }
        return max;
    }


}
