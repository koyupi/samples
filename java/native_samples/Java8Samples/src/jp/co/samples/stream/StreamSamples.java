package jp.co.samples.stream;

import java.util.ArrayList;
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
        List<String> sampleList = generateSampleList("mlb", "nhl", "nba", "mls",
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
            Predicate<String> filter = new StartWithPredicate("n");
            filterList = sampleList.stream().filter(filter)
                    .collect(Collectors.toList());
            break;
        // Generate empty list.
        default:
            filterList = Collections.emptyList();
        }

        // Print results.
        System.out.println("---------- start filter result ----------");
        for (String result : filterList) {
            System.out.println(result);
        }
        System.out.println("---------- end filter result ----------");
    }

    /**
     * Generate sample list.
     * 
     * @param strings
     *            add strings.
     * @return sample list
     */
    private static List<String> generateSampleList(String... strings) {

        List<String> list = new ArrayList<>();

        // Add strings.
        for (String arg : strings) {
            list.add(arg);
        }

        return list;
    }
}
