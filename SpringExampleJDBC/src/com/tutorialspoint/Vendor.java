package com.tutorialspoint;

public class Vendor {
	public Integer getVendor_num() {
		return vendor_num;
	}

	public void setVendor_num(Integer vendor_num) {
		this.vendor_num = vendor_num;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	private Integer vendor_num;
	private String vendor_name;
	private Integer version;

}