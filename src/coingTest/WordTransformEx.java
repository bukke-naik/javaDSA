package coingTest;

import java.util.Scanner;

public class WordTransformEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Check if transformation is possible
        boolean result = canTransform(word1, word2);
        System.out.println("Transformation is possible: " + result);

        scanner.close();
    }

    public static boolean canTransform(String word1, String word2) {
        // If lengths are different, transformation is not possible
        if (word1.length() != word2.length()) {
            return false;
        }

        // Count characters in both words
        int[] count = new int[26]; // For letters a-z

        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++; // Increment for word1
            count[word2.charAt(i) - 'a']--; // Decrement for word2
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false; // If any count is not zero, return false
            }
        }

        return true; // If all counts are zero, transformation is possible
    }
}