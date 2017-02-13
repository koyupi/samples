package jp.co.samples.bean;

/**
 * Sample Bean.<br>
 * Extends SampleBean1.
 */
public class SampleBean3 extends SampleBean2 {

    /**
     * Constructor.
     * 
     * @param name
     *            name
     */
    public SampleBean3(String name) {
        super(name);
    }

    /** age */
    private int age = 0;

    /**
     * Get age.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age.
     * 
     * @param age
     *            input age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
