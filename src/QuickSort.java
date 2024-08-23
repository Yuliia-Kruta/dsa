/*
The key process in quickSort is a partition(). The target of partitions is to place the pivot
(any element can be chosen to be a pivot) at its correct position in the sorted array and put
all smaller elements to the left of the pivot, and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed in its
correct position and this finally sorts the array.

Time Complexity: average O(n*log(n)) and worst O(n^2)
Auxiliary Space: worst - O(N)
*/
public class QuickSort {
    public static <T extends Comparable<T>> void quickSortAsc(T[] arr){
        quickSortAsc(arr, 0, arr.length-1);
    }

    private static <T extends Comparable<T>> void quickSortAsc(T[] arr, int start, int end){
        if(start<end){
            int pivotIndex = partition(arr, start, end);
            quickSortAsc(arr, start, pivotIndex-1);
            quickSortAsc(arr, pivotIndex+1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int start, int end) {
        int pivotIndex = (int) (start + (end - start + 1) * Math.random());
        T pivot = arr[pivotIndex];
        swap(arr, pivotIndex, end);
        int index = start;
        for(int i=start; i<end;  i++){
            if(arr[i].compareTo(pivot)<0){
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, index, end);
        return index;
    }
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
