package stacks;/* Authored by Kushagra on 1/19/2016. */

import java.util.Stack;

public class BalancedParenthesesDemo {
    public static void main(String[] args) {

        String S = "(()))";
        System.out.println(isValid(S));
    }

    // Assumes S is valid.
    private static boolean isValid(String S) {

        if (S == null) return true;
        if (S.equals("")) return true;

        char[] SS = S.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char s : SS) {

            if (s == '(') {
                stack.push(s);
            }

            if (s == ')') {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
