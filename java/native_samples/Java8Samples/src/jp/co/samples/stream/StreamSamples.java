package jp.co.samples.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream sample source codes.
 */
public class StreamSamples {

    /** Use lambda */
    private static final int MODE_LAMBDA = 0;
    /** Use predicate implements class */
    private static final int MODE_PREDICATE = 1;
    /** Use function implements class */
    private static final int MODE_FUNCTION = 2;

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // filter test.
        filterTest(MODE_LAMBDA);
        filterTest(MODE_PREDICATE);

        // map test.
        mapTest(MODE_LAMBDA);
        mapTest(MODE_FUNCTION);
    }

    /**
     * filter test method.<br>
     * collect use Collectors.toList.
     * 
     * @param mode
     *            mode.
     */
    private static void filterTest(int mode) {

        // Generate sample list.
        List<String> sampleList = Arrays.asList("mlb", "nhl", "nba", "mls",
                "nfl");

        List<String> filterList = null;
        // Filtered by start with [n].
        switch (mode) {
        // Use lambda.
        case MODE_LAMBDA:
            filterList = sampleList.stream().filter(s -> s.startsWith("n"))
                    .collect(Collectors.toList());
            break;
        // Use predicate implements class.
        case MODE_PREDICATE:
            Predicate<String> filter = new StartWithPredicate("m");
            filterList = sampleList.stream().filter(filter)
                    .collect(Collectors.toList());
            break;
        // Generate empty list.
        default:
            filterList = Collections.emptyList();
        }

        // Print results.
        System.out.println("---------- start filter result ----------");
        filterList.forEach(s -> System.out.println(s));
        System.out.println("---------- end filter result ----------");
    }

    /**
     * map test method.<br>
     * 
     */
    private static void mapTest(int mode) {

        List<String> sampleList = Arrays.asList("abc", "bcd", "cde", "def");

        List<String> mapList = null;
        // map values.
        switch (mode) {
        // Use lambda.
        case MODE_LAMBDA:
            mapList = sampleList.stream().map(s -> String.format("[%s]", s))
                    .collect(Collectors.toList());
            break;
        // Use function implements class.
        case MODE_FUNCTION:
            MapFunction function = new MapFunction();
            mapList = sampleList.stream().map(function)
                    .collect(Collectors.toList());
            break;
        // Generate empty list.
        default:
            mapList = Collections.emptyList();
            break;
        }

        // Print results.
        System.out.println("---------- start map result ----------");
        mapList.forEach(s -> System.out.println(s));
        System.out.println("---------- end map result ----------");
    }
}
