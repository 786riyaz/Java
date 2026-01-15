public class RemoveDuplicate {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII character set

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                // System.out.println("Adding character: " + seen[c]);
                seen[c] = true;
                System.out.println("Adding character: " + c);
                // System.out.println("Adding character: " + seen[c]);
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Riyaz Khan Pathan";
        String output = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    
}
