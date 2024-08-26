/*
Shell sort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead.
When an element has to be moved far ahead, many movements are involved. The idea of ShellSort is to allow
the exchange of far items. In Shell sort, we make the array h-sorted for a large value of h.
We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of
every h’th element are sorted.

Time Complexity: O(n^2)
Auxiliary Space: O(1)
*/
public class ShellSort {
    public static <T extends Comparable<T>> void shellSortAsc(T[] arr){
        int n = arr.length;
        for(int gap=n/2; gap>0; gap/=2){
            for(int i=gap; i<n; i++){
                T temp=arr[i];
                 Integer j;
                for (j=i; j.compareTo(gap) >= 0 && arr[j-gap].compareTo(temp) >0; j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }
}
