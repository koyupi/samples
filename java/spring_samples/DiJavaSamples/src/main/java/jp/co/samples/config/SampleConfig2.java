package jp.co.samples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.samples.bean.SampleBean2;

/**
 * Sample Configuration definition class.
 */
@Configuration
public class SampleConfig2 {

    /**
     * SampleBean2 definition.
     * 
     * @return SampleBean2
     */
    @Bean
    public SampleBean2 sampleBean2Config2() {
        SampleBean2 sampleBean2 = new SampleBean2();
        sampleBean2.setValue(
                "sampleBean2 configuration by Java. by SampleConfig2.");

        return sampleBean2;
    }
}
