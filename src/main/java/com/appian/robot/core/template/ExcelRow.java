package com.appian.robot.core.template;

import java.io.Serializable;

/**
 * POJO class representing an Excel row.
 *
 * @author Jidoka
 */
public class ExcelRow implements Serializable {

	/** Serial. */
	private static final long serialVersionUID = 1L;

	/** The column 1. */
	private String col1;

	/** The comlun 2. */
	private String col2;

	/** The column 3. */
	private String col3;

	/** The column 4. */
	private String col4;

	/** The result. */
	private String result;

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public String getCol3() {
		return col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	public String getCol4() {
		return col4;
	}

	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
