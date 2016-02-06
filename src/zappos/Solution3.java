package zappos;/* Authored by Kushagra on 1/28/2016. */

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int _letter_size = 0;
        _letter_size = Integer.parseInt(in.nextLine());
        String[] _letter = new String[_letter_size];
        String _letter_item;
        for (int _letter_i = 0; _letter_i < _letter_size; _letter_i++) {
            try {
                _letter_item = in.nextLine();
            } catch (Exception e) {
                _letter_item = null;
            }
            _letter[_letter_i] = _letter_item;
        }
        mystery(_letter);
    }

    private static void mystery(String[] S) {

        for (String str : S) {
            StringBuilder reverse = new StringBuilder(str).reverse();

            for (int idx = 0; idx < str.length() / 2; idx++)
                if (str.charAt(idx) < reverse.charAt(idx))
                    reverse.setCharAt(idx, str.charAt(idx));

            System.out.println(reverse.substring(0, str.length() / 2) + reverse.reverse().substring(str.length() / 2));
        }
    }
}
