package jp.co.samples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.samples.bean.SampleBean1;
import jp.co.samples.bean.SampleBean2;

/**
 * Sample Configuration definition class.
 */
@Configuration
public class SampleConfig1 {

    /**
     * SampleBean1 definition.
     * 
     * @return SampleBean1
     */
    @Bean
    public SampleBean1 sampleBean1() {
        SampleBean1 sampleBean1 = new SampleBean1();
        sampleBean1.setValue("sampleBean1 configuration by Java.");

        return sampleBean1;
    }

    /**
     * SampleBean2 definition.
     * 
     * @return SampleBean2
     */
    @Bean
    public SampleBean2 sampleBean2Config1() {
        SampleBean2 sampleBean2 = new SampleBean2();
        sampleBean2.setValue(
                "sampleBean2 configuration by Java. by SampleConfig1.");

        return sampleBean2;
    }
}
