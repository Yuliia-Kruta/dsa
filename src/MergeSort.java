/*
Merge sort is a sorting algorithm that follows the divide-and-conquer approach.
It works by recursively dividing the input array into smaller subarrays and sorting those
subarrays then merging them back together to obtain the sorted array.

Time Complexity: O(n log(n))
Auxiliary Space: O(n)
*/
public class MergeSort {
    public static <T extends Comparable<T>> void mergeSortAsc(T[] arr){
        int n = arr.length;
        if (n<=1)return;
        int mid = n/2;
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[n-mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        mergeSortAsc(left);
        mergeSortAsc(right);
        merge(arr, left, right);
    }

    private static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j == left.length) {
                arr[i] = right[k++];
            } else if (k == right.length) {
                arr[i] = left[j++];
            } else if (left[j].compareTo(right[k]) < 0) {
                arr[i] = left[j++];
            } else {
                arr[i] = right[k++];
            }
        }
    }

}
