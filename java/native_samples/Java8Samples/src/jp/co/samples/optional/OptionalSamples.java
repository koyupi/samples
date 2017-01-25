package jp.co.samples.optional;

import java.util.Optional;

/**
 * Optional sample source codes.
 */
public class OptionalSamples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // Optional test.
        optionalTest();
        nullableOptionalTest();
    }

    /**
     * Optional test.
     */
    private static void optionalTest() {

        // Create optional instance.
        Optional<String> optional = Optional.of("value");

        System.out.println("Start optional test.");

        // Null check.
        System.out.println(optional.isPresent());
        // Print value.
        System.out.println(optional.get());
    }

    /**
     * Nullable optional test.
     */
    private static void nullableOptionalTest() {

        // Create ooptional instance.
        Optional<String> optional = Optional.ofNullable(null);

        System.out.println("Start nullable optional test.");

        // Null check.
        System.out.println(optional.isPresent());
        // Print value.
        System.out.println(optional.orElse("default"));
    }
}
