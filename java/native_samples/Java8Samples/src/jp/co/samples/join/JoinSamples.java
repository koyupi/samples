package jp.co.samples.join;

import java.util.StringJoiner;

/**
 * Join string sample source codes.
 */
public class JoinSamples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // Join test.
        stringTest();
        stringJoinerTest();
    }

    /**
     * Join string test.
     */
    private static void stringTest() {

        String[] sampleArray = new String[] { "a", "b", "c" };

        // Join strings.
        String join = String.join(",", sampleArray);
        System.out.println(join);
    }

    /**
     * StringJoiner test.
     */
    private static void stringJoinerTest() {

        StringJoiner joiner = new StringJoiner(",");
        // Add join strings.
        joiner.add("x");
        joiner.add("y");
        joiner.add("z");

        // Join strings.
        String join = joiner.toString();
        System.out.println(join);
    }
}
