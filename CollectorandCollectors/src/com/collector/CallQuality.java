package com.collector;

public class CallQuality {
	int callId;
	int callDuration;
	float dropRate;
	String mobileNo;
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	public float getDropRate() {
		return dropRate;
	}
	public void setDropRate(float dropRate) {
		this.dropRate = dropRate;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public CallQuality() 
	{
		
	}
	public CallQuality(int callId, int callDuration, float dropRate, String mobileNo) {
		super();
		this.callId = callId;
		this.callDuration = callDuration;
		this.dropRate = dropRate;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "CallQuality [callId=" + callId + ", callDuration=" + callDuration + ", dropRate=" + dropRate
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}
