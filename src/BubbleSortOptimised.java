import java.util.Arrays;

/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
if they are in the wrong order. This algorithm is not suitable for large data sets as its average and
worst-case time complexity is quite high.

Time Complexity: O(N^2)
Auxiliary Space: O(1)
*/
public class BubbleSortOptimised {

    public static <T extends Comparable<T>> void bubbleSortAsc(T[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i< n-1; i++){
            swapped = false;
            for (int j = 0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
}
