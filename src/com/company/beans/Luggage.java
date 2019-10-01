package com.company.beans;

public class Luggage {
	
	private int weight;
	private int itemsNumber;
	private Ticket ownerTicket;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setItemsNumber(int itemsNumber) {
		this.itemsNumber = itemsNumber;
	}
	
	public int getItemsNumber() {
		return this.itemsNumber;
	}
	
	public void setOwnerTicket(Ticket ownerTicket) {
		this.ownerTicket = ownerTicket;
	}
	
	public Ticket getOwnerTicket() {
		return this.ownerTicket;
	}
}
