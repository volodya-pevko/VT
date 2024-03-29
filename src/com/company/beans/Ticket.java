package com.company.beans;

public class Ticket {
	
	private Flight flight;
	private int placeNumber;
	private Client owner;
	private Luggage luggage;
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public Flight getFlight() {
		return this.flight;
	}
	
	public void setPlaceNumber(int placeNumber) {
		this.placeNumber = placeNumber;
	}
	
	public int getPlaceNumber() {
		return this.placeNumber;
	}
	
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	public void setLuggage(Luggage luggage) {
		this.luggage = luggage;
	}
	
	public Luggage getLuggage() {
		return this.luggage;
	}
}
