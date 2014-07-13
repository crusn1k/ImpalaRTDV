package model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class LolModel {	
	@Range(min=3, max=10)
	private int lolId;
	@NotNull
	@Length(min=3, max=15)
	private String lolName;
	@NotNull
	@Length(min=10, max=50)
	private String lolDesc;	
	public int getLolId() {
		return lolId;
	}
	public void setLolId(int lolId) {
		this.lolId = lolId;
	}
	public String getLolName() {
		return lolName;
	}
	public void setLolName(String lolName) {
		this.lolName = lolName;
	}
	public String getLolDesc() {
		return lolDesc;
	}
	public void setLolDesc(String lolDesc) {
		this.lolDesc = lolDesc;
	}

}