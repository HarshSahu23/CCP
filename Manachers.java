public class Manachers {

    public static String findLongestPalindromicSubstring(String s) {    
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] paddedString = prepareString(s);
        int n = paddedString.length;
        int[] p = new int[n]; // Array to store lengths of palindromes around each character
        int center = 0; // Center of the rightmost palindrome found so far   
        int right = 0; // Right boundary of the rightmost palindrome found so far

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i; // Mirror of i in the current palindrome
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Attempt to expand the palindrome centered at i
            while (paddedString[i + (1 + p[i])] == paddedString[i - (1 + p[i])]) {
                p[i]++;
            }

            // Update the rightmost palindrome if needed
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // Find the maximum length palindrome and its center
        int maxLen = 0;
        int maxCenter = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        // Extract the longest palindromic substring
        int start = (maxCenter - maxLen) / 2;
        int end = start + maxLen;
        return s.substring(start, end);
    }

    private static char[] prepareString(String s) {
        int n = s.length();
        char[] paddedString = new char[2 * n + 3];
        paddedString[0] = '#';
        paddedString[1] = '#';
        paddedString[2 * n + 2] = '@';

        for (int i = 0; i < n; i++) {
            paddedString[2 * i + 2] = s.charAt(i);
            paddedString[2 * i + 3] = '#';
        }

        return paddedString;
    }

    public static void main(String[] args) {
        String input = "EYES";
        System.out.println("\n\nName = Harsh Sahu");
        System.out.println("Reg. No: 21BSA10129");
        String longestPalindrome = findLongestPalindromicSubstring(input);
        System.out.println("Original String:               " + input);
        System.out.println("Longest palindromic substring: " + longestPalindrome); 
        System.out.println();
    }
}

