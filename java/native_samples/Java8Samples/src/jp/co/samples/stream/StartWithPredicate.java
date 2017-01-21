package jp.co.samples.stream;

import java.util.function.Predicate;

/**
 * Predicate implements class.<br>
 * Use filtered by startWith prefix.<br>
 */
public class StartWithPredicate implements Predicate<String> {

    /** prefix : use filtered startWith. */
    private String prefix = null;

    /**
     * Constructor.
     */
    public StartWithPredicate(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @see Predicate#test(Object)
     */
    @Override
    public boolean test(String value) {

        return value.startsWith(this.prefix);
    }

}
