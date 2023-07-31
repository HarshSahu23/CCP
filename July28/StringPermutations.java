package July28;
import java.util.HashMap;

public class StringPermutations {
    public static void printPermutations(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string should not be empty.");
        } else {
            char[] arr = input.toCharArray();
            printPermutationsRecursive(arr, 0);
        }
    }

    private static void printPermutationsRecursive(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            printPermutationsRecursive(arr, index + 1);
            swap(arr, index, i); // Backtrack to restore the original order for the next iteration
        }
    }

    // private static void printPermutationsWithCharSwapped(char[] arr, int i, int j) {
    //     if (j == arr.length) {
    //         return;
    //     }

    //     swap(arr, i, j);
    //     printPermutationsWithCharSwapped(arr, i, j + 1);
    //     swap(arr, i, j); 
    // }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static long calculateUniquePermutations(String input) {
        
        if (input == null || input.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        int totalLength = input.length();
        long totalPermutations = factorial(totalLength);

        for (int frequency : charFrequencyMap.values()) {
            totalPermutations /= factorial(frequency);
        }

        return totalPermutations;
    }

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        String input = "SAHU";
        System.out.println("All permutations of \"" + input + "\":");
        printPermutations(input);
        long uniquePermutations = calculateUniquePermutations(input);
        System.out.println("\nTotal number of unique permutations = " + uniquePermutations);
    }
}
