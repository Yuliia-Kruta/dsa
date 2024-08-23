/*
1. Build a heap from the given input array.
2. Repeat the following steps until the heap contains only one element:
 - Swap the root element of the heap (which is the largest element) with the last element of the heap.
 - Remove the last element of the heap (which is now in the correct position).
 - Heapify the remaining elements of the heap.
3. The sorted array is obtained by reversing the order of the elements in the input array.

Time Complexity: O(n*log(n))
Auxiliary Space: O(log(n))
*/
public class HeapSort {
    public static <T extends Comparable<T>> void heapSortAsc(T[] arr){
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static <T extends Comparable<T>> void heapify(T[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l].compareTo(arr[largest])>0) {
            largest = l;
        }
        if (r < n && arr[r].compareTo(arr[largest])>0) {
            largest = r;
        }
        if (largest != i) {
            T temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }

    }
}
