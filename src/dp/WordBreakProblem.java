package dp;/* Authored by Kushagra on 12/13/2015. */

import java.util.Arrays;
import java.util.HashSet;

public class WordBreakProblem {

    public static void main(String[] args) {

        String word = "ilike";
        HashSet<String> dictionary = new HashSet<>(Arrays.asList("mobile", "samsung", "sam", "sung", "man", "mango",
                "icecream", "and", "go", "i", "like", "ice", "cream"));

        System.out.println(recursiveWordBreak(word, dictionary));
        System.out.println(wordBreak(word, dictionary));
    }

    // DP approach, Revisit
    private static boolean wordBreak(String word, HashSet<String> dictionary) {

        int size = word.length();

        if (size == 0) return true;

        boolean[] wb = new boolean[size + 1];
        for (int i = 1; i <= size; i++) {

            if (dictionary.contains(word.substring(0, i)) &&
                    wordBreak(word.substring(i, size), dictionary)) {
                wb[i] = true;
            }

            // check for intermediate suffixes
            if (wb[i]) {

                if (i == size) return true;

                for (int j = i+1; j <= size; j++) {

                    if (!wb[j] && dictionary.contains(word.substring(i, i + j -1))) {
                        wb[j] = true;
                    }

                    if (wb[j] && j==size) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean recursiveWordBreak(String word, HashSet<String> dictionary) {

        int size = word.length();

        // Base case
        if (size == 0) return true;

        // Try all prefixes of lengths 1..n
        for (int i = 1; i <= size; i++) {

            if (dictionary.contains(word.substring(0, i)) &&
                    recursiveWordBreak(word.substring(i, size), dictionary)) {

                return true;
            }
        }

        return false;
    }


}
