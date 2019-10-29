package com.company.beans;

public class Luggage {
	
	private int weight;
	private Ticket ownerTicket;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setOwnerTicket(Ticket ownerTicket) {
		this.ownerTicket = ownerTicket;
	}
	
	public Ticket getOwnerTicket() {
		return this.ownerTicket;
	}
}
