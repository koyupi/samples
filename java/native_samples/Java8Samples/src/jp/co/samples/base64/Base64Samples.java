package jp.co.samples.base64;

import java.util.Base64;

/**
 * base64 sample source codes.
 */
public class Base64Samples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // target value string.
        String value = "abcdefghijklmn";

        // Encode base64.
        String encodeValue = Base64.getEncoder()
                .encodeToString(value.getBytes());
        System.out.println(encodeValue);

        // Decode base64.
        String decodeValue = new String(
                Base64.getDecoder().decode(encodeValue));
        System.out.println(decodeValue);
    }
}
