import java.util.Arrays;

/*
Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of
an unsorted list into its correct position in a sorted portion of the list.

Time Complexity: O(N^2)
Auxiliary Space: O(1)
*/
public class InsertionSort {
    public static <T extends Comparable<T>> void insertionSortAsc(T[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            T key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j].compareTo(key)>0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
