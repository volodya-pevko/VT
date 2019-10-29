package com.company.beans;

import java.util.ArrayList;

public class Flight {

	private int id;
	private Plane plane;
	private Pilot pilot;
	private ArrayList<Ticket> tickets;
	private String startAirport;
	private String destinationAirport;
	private int cost;
	private String date;
	private String startTime;
	private String destinationTime;

	public void setId(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	public Plane getPlane() {
		return this.plane;
	}
	
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
	public Pilot getPilot() {
		return this.pilot;
	}
	
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public ArrayList<Ticket> getTickets() {
		return this.tickets;
	}
	
	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}
	
	public String getStartAirport() {
		return this.startAirport;
	}
	
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	public String getDestinationAirport() {
		return this.destinationAirport;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return this.cost;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getStartTime() {
		return this.startTime;
	}
	
	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}
	
	public String getDestinationTime() {
		return this.destinationTime;
	}
}
