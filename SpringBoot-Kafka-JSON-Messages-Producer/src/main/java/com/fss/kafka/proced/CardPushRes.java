package com.fss.kafka.proced;

public class CardPushRes {
	String resultcode;
	String description;
	String dcmsREFID;
	String vendorcode;
	
	public String getVendorcode() {
		return vendorcode;
	}
	public void setVendorcode(String vendorcode) {
		this.vendorcode = vendorcode;
	}
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDcmsREFID() {
		return dcmsREFID;
	}
	public void setDcmsREFID(String dcmsREFID) {
		this.dcmsREFID = dcmsREFID;
	}
	
	public String toString()
	{
		return new StringBuilder("Response : ").append("Resultcode - ")
				.append(resultcode).append(", Description - ").append(description)
				.append(", DCMS Ref ID - ").append(dcmsREFID).append(", VendorCode - ")
				.append(vendorcode).toString();
	}
}
