package jp.co.samples.bean;

/**
 * Sample Bean.
 */
public class SampleBean2 {

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            name
	 */
	public SampleBean2(String name) {
		this.name = name;
	}

	/** name */
	private String name = null;

	/**
	 * Get name.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name.
	 * 
	 * @param name
	 *            input name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
