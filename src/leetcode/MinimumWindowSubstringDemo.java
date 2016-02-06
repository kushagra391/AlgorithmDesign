package leetcode;/* Authored by Kushagra on 2/1/2016. */

import java.util.HashSet;

public class MinimumWindowSubstringDemo {

    public static void main(String[] args) {

        String S = "ADOBECODEBANC";
        String T = "ABC";

        System.out.println(MinimumWindowSubstring(S, T));


    }

    private static int MinimumWindowSubstring(String S, String T) {

        int m = S.length();
        int n = T.length();

        HashSet<Character> set = new HashSet<>();
        for (char t : T.toCharArray() ) {
            set.add(t);
        }

        HashSet<SetEntry> currentSet = new HashSet<>();
        for (int i=0; i<S.length(); i++) {

            char x = S.charAt(i);

            if (set.contains(x)) {

                SetEntry se = new SetEntry(x, i);
                if (currentSet.contains(se)) {

                    // update new info
                    


                }
                else {

                }

                // all characters found in the current set
                if (currentSet.size() == set.size()) {

                }

            }


        }



        return 0;
    }


    static class SetEntry {

        char key;
        int position;

        SetEntry(char key, int position) {
            this.key = key;
            this.position = position;
        }
    }


}
