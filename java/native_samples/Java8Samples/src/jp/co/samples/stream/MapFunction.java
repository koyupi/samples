package jp.co.samples.stream;

import java.util.function.Function;

/**
 * Function implements class.<br>
 * Use map add string [].<br>
 */
public class MapFunction implements Function<String, String> {

    /**
     * @see Function#apply(Object)
     */
    @Override
    public String apply(String value) {
        return String.format("{%s}", value);
    }
}
