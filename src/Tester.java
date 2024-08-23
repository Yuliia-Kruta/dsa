import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        int length = 9;
        Integer[] arr = new Integer[length];
        Random rand = new Random();
        for(int i = 0; i<length; i++){
            arr[i] = rand.nextInt(0,2000);
        }
        System.out.println("Given array:");
        System.out.println(Arrays.toString(arr));

        //BubbleSortOptimised.bubbleSortAsc(arr);
        //System.out.println("After bubble sort:");

        //SelectionSort.selectionSortAsc(arr);
        //System.out.println("After selection sort:");

        //InsertionSort.insertionSortAsc(arr);
        //System.out.println("After insertion sort:");

        MergeSort.mergeSortAsc(arr);
        System.out.println("After merge sort:");

        System.out.println(Arrays.toString(arr));
    }
}