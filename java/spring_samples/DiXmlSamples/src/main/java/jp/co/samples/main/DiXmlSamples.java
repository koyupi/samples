package jp.co.samples.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jp.co.samples.bean.SampleBean1;
import jp.co.samples.bean.SampleBean2;

/**
 * Dependency Injection by xml definition samples.
 */
public class DiXmlSamples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // Generate AppContext instance.
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean.xml");

        // DI SampleBean1.
        generateBean1(context);

        // DI SampleBean2.
        generateBean2(context);
    }

    /**
     * DI by xml sample.<br>
     * Sample bean have no constructor definition.
     * 
     * @param context
     *            Application context
     */
    private static void generateBean1(ApplicationContext context) {

        // Get bean by bean name.
        SampleBean1 bean1 = (SampleBean1) context.getBean("bean1");
        System.out.println("DI by specified name : " + bean1.getName());

        // Get bean by bean class.
        SampleBean1 bean2 = context.getBean(SampleBean1.class);
        System.out.println("DI by bean class : " + bean2.getName());

        // Get bean by bean name and class.
        SampleBean1 bean3 = context.getBean("bean1", SampleBean1.class);
        System.out.println(
                "DI by specified name and bean class : " + bean3.getName());
    }

    /**
     * DI by xml sample.<br>
     * Sample bean have constructor.
     * 
     * @param context
     */
    private static void generateBean2(ApplicationContext context) {

        // Get bean by bean name.
        SampleBean2 bean1 = (SampleBean2) context.getBean("bean2");
        System.out.println("DI by specified name : " + bean1.getName());
    }
}
