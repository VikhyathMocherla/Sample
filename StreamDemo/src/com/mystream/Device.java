package com.mystream;

public class Device 
{
	private String name;
	private String technicalName;
	private int no_of_days_assigned;
	public int getNo_of_days_assigned() {
		return no_of_days_assigned;
	}
	public void setNo_of_days_assigned(int no_of_days_assigned) {
		this.no_of_days_assigned = no_of_days_assigned;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicalName() {
		return technicalName;
	}
	public void setTechnicalName(String technicalName) {
		this.technicalName = technicalName;
	}

	public Device() 
	{
	
	}
	public Device(String name, String technicalName, int no_of_days_assigned) {
		super();
		this.name = name;
		this.technicalName = technicalName;
		this.no_of_days_assigned = no_of_days_assigned;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", technicalName=" + technicalName + ", no_of_days_assigned="
				+ no_of_days_assigned + "]";
	}
	
	

}
