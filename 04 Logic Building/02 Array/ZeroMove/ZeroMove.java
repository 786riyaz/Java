// move all 0 elements at start of array
public class ZeroMove {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 4, 0, 5, 6, 0, 7};
        int n = arr.length;
        int index = 0;

        int[] result = new int[n];

        for(int i=0; i<n; i++){
            if(arr[i] == 0) {
                result[index++] = arr[i];
            } 
        }

        for(int i=0; i<n; i++){
            if(arr[i] != 0) {
                result[index++] = arr[i];
            } 
        }
        
        // Print the modified array
        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}