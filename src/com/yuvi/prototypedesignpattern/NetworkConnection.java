package com.yuvi.prototypedesignpattern;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String importantData;

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}

	public String getImportantData() {
		return importantData;
	}

	public void loadVeryImportantData() throws InterruptedException {
		this.importantData = "Very very secrete important data";
		Thread.sleep(5000);
		// it will take 5 minutes...
	}

	@Override
	public String toString() {
		return this.ip + " : " + this.importantData;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
