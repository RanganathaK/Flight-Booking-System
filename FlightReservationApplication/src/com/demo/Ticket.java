package com.demo;

public class Ticket {
	private int flightID;
	private String flightName;
	private String source;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String seatNumber;
	private  int ticketId;
	private String date;
	private Passengers passengers;

	public Ticket(int flightID, String flightName, String source, String destination, String departureTime,
			String arrivalTime, String seatNumber, Passengers passengers, String date) {
		this.flightID = flightID;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seatNumber = seatNumber;
		this.passengers = passengers;
		this.date=date;
		this.ticketId = generateTicketId();
	}

	private static int lastGeneratedTicketId = 0;

	private synchronized int generateTicketId() {
		return ++lastGeneratedTicketId;
	}

	@Override
	public String toString() {
		return "Ticket [" + ticketId + "." + " flightID=" + flightID + ", flightName=" + flightName + ", source="
				+ source + ", destination=" + destination +", Date of Journey="+ date + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", seatNumber=" + seatNumber + ", Name=" + passengers.getName() + ", Age="
				+ passengers.getAge() + ", MobileNo=" + passengers.getMobileNo() + "]";
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getFlightName() {
		return flightName;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Passengers getPassengers() {
		return passengers;
	}

	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}

}
