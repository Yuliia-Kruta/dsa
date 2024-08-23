import java.util.Arrays;

/*
The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list
and swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted
portion until the entire list is sorted.

Time Complexity: O(N^2)
Auxiliary Space: O(1)
*/
public class SelectionSort {
    public static <T extends Comparable<T>> void selectionSortAsc(T[] arr){
        int n = arr.length;
        T temp;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1;j<n; j++){
                if(arr[j].compareTo(arr[min])<0){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]= temp;
        }
    }
}
