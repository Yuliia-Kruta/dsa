/*
Iterative Merge Sort is a sorting algorithm that uses the divide-and-conquer approach
without recursion. Instead of dividing the input array recursively, it repeatedly merges
subarrays of increasing size in a bottom-up manner until the entire array is sorted.

Time Complexity: O(n*log(n))
Auxiliary Space: O(n)
*/
public class IterativeMergeSort {

    public static <T extends Comparable<T>> void mergeSortAsc(T[] arr) {
        int n = arr.length;
        T[] aux = (T[]) new Comparable[n];
        boolean notSorted = true;
        int step = 0;

        while (notSorted) {
            step++;
            if (step % 2 != 0) {
                notSorted = mergeStep(arr, aux, n);
            } else {
                notSorted = mergeStep(aux, arr, n);
            }
        }
        if (step % 2 == 0) {
            System.arraycopy(aux, 0, arr, 0, n);
        }
    }

    private static <T extends Comparable<T>> boolean mergeStep(T[] src, T[] dest, int n) {
        int left = 1;
        int mid, right;
        boolean notSorted = false;

        while (left <= n) {
            mid = findSortedBoundary(src, left, n);
            if (mid < n) {
                right = findSortedBoundary(src, mid + 1, n);
                merge(src, dest, left - 1, mid - 1, right - 1);
                notSorted = true;
                left = right + 1;
            } else {
                copyRemaining(src, dest, left - 1, n - 1);
                break;
            }
        }

        return notSorted;
    }

    private static <T extends Comparable<T>> int findSortedBoundary(T[] arr, int start, int end) {
        while (start < end && arr[start - 1].compareTo(arr[start]) <= 0) {
            start++;
        }
        return start;
    }


    private static <T extends Comparable<T>> void merge(T[] src, T[] dest, int left, int mid, int right) {
        int i = left, j = mid + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid) {
                dest[k] = src[j++];
            } else if (j > right) {
                dest[k] = src[i++];
            } else if (src[i].compareTo(src[j]) <= 0) {
                dest[k] = src[i++];
            } else {
                dest[k] = src[j++];
            }
        }
    }


    private static <T extends Comparable<T>> void copyRemaining(T[] src, T[] dest, int start, int end) {
        for (int i = start; i <= end; i++) {
            dest[i] = src[i];
        }
    }
}
