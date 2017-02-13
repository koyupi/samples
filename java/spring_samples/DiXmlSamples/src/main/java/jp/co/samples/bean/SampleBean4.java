package jp.co.samples.bean;

/**
 * Sample Bean.<br>
 * Use reference definition.
 */
public class SampleBean4 {

    /** SampleBean1 */
    private SampleBean1 bean1 = null;

    /**
     * Get SampleBean.
     * 
     * @return bean
     */
    public SampleBean1 getBean1() {
        return bean1;
    }

    /**
     * Set SampleBean.
     * 
     * @param bean1
     *            bean
     */
    public void setBean1(SampleBean1 bean1) {
        this.bean1 = bean1;
    }
}
