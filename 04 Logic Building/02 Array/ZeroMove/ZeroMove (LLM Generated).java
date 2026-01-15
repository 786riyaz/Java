// move all 0 elements at start of array
public class ZeroMove {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 4, 0, 5, 6, 0, 7};
        int n = arr.length;

        int[] result = moveZerosToStart(arr, n);

        // Print the modified array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] moveZerosToStart(int[] arr, int n) {
        int[] result = new int[n];
        int index = 0;

        // First, add all zeros to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                result[index++] = arr[i];
            }
        }

        // Then, add all non-zero elements to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}