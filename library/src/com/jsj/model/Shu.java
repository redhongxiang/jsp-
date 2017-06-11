package com.jsj.model;

public class   Shu {
	private int id;
	private String shuhao;
	private String shuming;
	private String chubanshe;
	private String zuozhe;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShuhao() {
		return shuhao;
	}
	public void setShuhao(String shuhao) {
		this.shuhao = shuhao;
	}
	public String getShuming() {
		return shuming;
	}
	public void setShuming(String shuming) {
		this.shuming = shuming;
	}
	public String getChubanshe() {
		return chubanshe;
	}
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	@Override
	public String toString() {
		return "Shu [id=" + id + ", shuhao=" + shuhao + ", shuming=" + shuming
				+ ", chubanshe=" + chubanshe + ", zuozhe=" + zuozhe + "]";
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
}
