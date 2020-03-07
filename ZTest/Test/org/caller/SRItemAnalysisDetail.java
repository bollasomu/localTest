package org.caller;

import java.io.Serializable;
import java.util.Date;

/**
 * @author rsahoo
 *
 * @since Date: 19-Sep-2017
 */

public class SRItemAnalysisDetail implements Serializable {

	/**
                * 
                 */
	private static final long serialVersionUID = 5504220586116731571L;

	
	private Integer srItemAnalysisId;

	
	private Integer iatServiceRequestId;

	
	private String className;

	
	private Date rowCreated;

	
	private Date rowUpdated;

	private String analysis;

	public Integer getSrItemAnalysisId() {
		return srItemAnalysisId;
	}

	public void setSrItemAnalysisId(Integer srItemAnalysisId) {
		this.srItemAnalysisId = srItemAnalysisId;
	}

	public Integer getIatServiceRequestId() {
		return iatServiceRequestId;
	}

	public void setIatServiceRequestId(Integer iatServiceRequestId) {
		this.iatServiceRequestId = iatServiceRequestId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Date getRowCreated() {
		return rowCreated;
	}

	public void setRowCreated(Date rowCreated) {
		this.rowCreated = rowCreated;
	}

	public Date getRowUpdated() {
		return rowUpdated;
	}

	public void setRowUpdated(Date rowUpdated) {
		this.rowUpdated = rowUpdated;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	@Override
	public String toString() {
		return "SRItemAnalysisDetail [srItemAnalysisId=" + srItemAnalysisId + ", iatServiceRequestId="
				+ iatServiceRequestId + ", className=" + className + ", rowCreated=" + rowCreated + ", rowUpdated="
				+ rowUpdated + ", analysis=" + analysis + "]";
	}
}
