package jp.co.samples.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.co.samples.bean.SampleBean1;
import jp.co.samples.bean.SampleBean2;
import jp.co.samples.config.SampleConfig1;
import jp.co.samples.config.SampleConfig2;

/**
 * Dependency Injection by Java definition samples.
 */
public class DiJavaSamples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // Create ApplicationContext by Configuration Java class.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SampleConfig1.class, SampleConfig2.class);

        // DI SampleBean1.
        generateBean1(context);

        // DI SampleBean2.
        generateBean2(context);
    }

    /**
     * DI by Java Configuration sample.
     * 
     * @param context
     *            Application Context
     */
    private static void generateBean1(
            AnnotationConfigApplicationContext context) {

        // Get bean1.
        SampleBean1 bean1 = context.getBean(SampleBean1.class);
        System.out.println("Configuration by Java : " + bean1.getValue());
    }

    /**
     * DI by Java Configuration sample.
     * 
     * @param context
     *            Application Context
     */
    private static void generateBean2(
            AnnotationConfigApplicationContext context) {

        // Get bean2 by Config1.
        SampleBean2 bean2_1 = context.getBean("sampleBean2Config1",
                SampleBean2.class);
        System.out.println("Configuration by Java : " + bean2_1.getValue());

        // Get bean2 by Config2.
        SampleBean2 bean2_2 = context.getBean("sampleBean2Config2",
                SampleBean2.class);
        System.out.println("Configuration by Java : " + bean2_2.getValue());
    }
}
