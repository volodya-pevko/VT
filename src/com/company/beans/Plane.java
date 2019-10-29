package com.company.beans;

public class Plane {
	
	private int sitsCount;
	private String model;

	public Plane(){}

	public Plane(String model, int sitsCount){
		this.model = model;
		this.sitsCount = sitsCount;
	}
	
	public void setSitsCount(int sitsCount) {
		this.sitsCount = sitsCount;
	}
	
	public int getSitsCount() {
		return this.sitsCount;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
}
