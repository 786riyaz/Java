package Arrays;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};

        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index);

        int[] copy = Arrays.copyOf(arr, 3);
        System.out.println("Copy: " + Arrays.toString(copy));

        Arrays.fill(arr, 100);
        System.out.println("After fill: " + Arrays.toString(arr));
    }
}