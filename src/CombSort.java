/*
Comb Sort is mainly an improvement over Bubble Sort. Bubble sort always compares adjacent values.
So all inversions are removed one by one. Comb Sort improves on Bubble Sort by using a gap of the size
of more than 1. The gap starts with a large value and shrinks by a factor of 1.3 in every iteration until
it reaches the value 1. Thus Comb Sort removes more than one inversion count with one swap and performs better
than Bubble Sort.

Time Complexity: worst O(n^2) and best O(n*log(n))
Auxiliary Space: O(1)
*/
public class CombSort {
    public static <T extends Comparable<T>> void combSortAsc(T[] arr){
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        while(gap!=1 || swapped){
            gap = Math.max((gap * 10) / 13, 1);
            swapped = false;
            for(int i=0; i<n-gap; i++){
                if (arr[i].compareTo(arr[i+gap])>0){
                    T temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    swapped = true;
                }
            }
        }
    }
}
