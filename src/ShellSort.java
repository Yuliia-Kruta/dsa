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
