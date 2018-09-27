package com.bdi.sp.vo;

import org.springframework.stereotype.Component;

@Component
public class TestVO {
	private Integer tnum;
	private String tname;
	private Integer tage;
	public Integer getTnum() {
		return tnum;
	}
	public void setTnum(Integer tnum) {
		this.tnum = tnum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
	@Override
	public String toString() {
		return "TestVO [tnum=" + tnum + ", tname=" + tname + ", tage=" + tage + "]";
	}
	
}
