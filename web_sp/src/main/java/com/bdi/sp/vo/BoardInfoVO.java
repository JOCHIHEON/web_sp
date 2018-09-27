package com.bdi.sp.vo;

public class BoardInfoVO {
	/** 게시판번호. */
	private Integer binum;

	/** 게시판제목. */
	private String bititle;

	/** 게시판내용. */
	private String bitext;

	/** 게시판파일. */
	private String bifile;

	/** 게시판등록일자. */
	private String bicredat;

	/** 게시판수정일자. */
	private String bimoddat;

	/** 게시판조회수. */
	private Integer bicnt;

	/** 게시판활성여부. */
	private Byte biactive;

	private Integer uinum;
	
	private String uiname;

	
	public Integer getBinum() {
		return binum;
	}


	public void setBinum(Integer binum) {
		this.binum = binum;
	}


	public String getBititle() {
		return bititle;
	}


	public void setBititle(String bititle) {
		this.bititle = bititle;
	}


	public String getBitext() {
		return bitext;
	}


	public void setBitext(String bitext) {
		this.bitext = bitext;
	}


	public String getBifile() {
		return bifile;
	}


	public void setBifile(String bifile) {
		this.bifile = bifile;
	}


	public String getBicredat() {
		return bicredat;
	}


	public void setBicredat(String bicredat) {
		this.bicredat = bicredat;
	}


	public String getBimoddat() {
		return bimoddat;
	}


	public void setBimoddat(String bimoddat) {
		this.bimoddat = bimoddat;
	}


	public Integer getBicnt() {
		return bicnt;
	}


	public void setBicnt(Integer bicnt) {
		this.bicnt = bicnt;
	}


	public Byte getBiactive() {
		return biactive;
	}


	public void setBiactive(Byte biactive) {
		this.biactive = biactive;
	}


	public Integer getUinum() {
		return uinum;
	}


	public void setUinum(Integer uinum) {
		this.uinum = uinum;
	}


	public String getUiname() {
		return uiname;
	}


	public void setUiname(String uiname) {
		this.uiname = uiname;
	}


	@Override
	public String toString() {
		return "BoardInfoVO [binum=" + binum + ", bititle=" + bititle + ", bitext=" + bitext + ", bifile=" + bifile
				+ ", bicredat=" + bicredat + ", bimoddat=" + bimoddat + ", bicnt=" + bicnt + ", biactive=" + biactive
				+ ", uinum=" + uinum + ", uiname=" + uiname + "]";
	}
	
}