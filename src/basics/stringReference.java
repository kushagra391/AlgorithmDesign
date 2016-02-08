package basics;/* Authored by Kushagra on 2/7/2016. */

public class stringReference {

    public static void main(String[] args) {

        String s = "Hello";

        alterString(s);

        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        alterBuilder(sb);

        System.out.println(sb);

    }

    private static void alterBuilder(StringBuilder sb) {
        sb.append(" World");
    }

    private static void alterString(String s) {
        s = "Hello World";
    }
}
