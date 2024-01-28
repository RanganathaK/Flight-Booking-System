package com.demo;

public class Flight {
	private int flightId;

	private String flightName;

	private String source;

	private String destination;

	private String timeToDeparture;
	
	private String timeToReach;
	
	private int availableSeats;
    
    private String dateOfJourney;

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	

	public Flight(int flightId, String flightName, String source, String destination, String dateOfJourney,String timeToDeparture,
			String timeToReach, int availableSeats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.timeToDeparture = timeToDeparture;
		this.timeToReach = timeToReach;
		this.availableSeats = availableSeats;
		this.dateOfJourney=dateOfJourney;
	}

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public String getTimeToDeparture() {
		return timeToDeparture;
	}

	public void setTimeToDeparture(String timeToDeparture) {
		this.timeToDeparture = timeToDeparture;
	}

	public String getTimeToReach() {
		return timeToReach;
	}

	public void setTimeToReach(String timeToReach) {
		this.timeToReach = timeToReach;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
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


}
