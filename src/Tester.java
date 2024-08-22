import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        int length = 9;
        int[] arr = new int[length];
        Random rand = new Random();
        for(int i = 0; i<length; i++){
            arr[i] = rand.nextInt(-2000,2000);
        }
        System.out.println("Given array: "+ Arrays.toString(arr));
    }
}