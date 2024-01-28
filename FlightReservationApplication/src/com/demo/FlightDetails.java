package com.demo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightDetails {

	Seat seat = new Seat();
	PassengersDetails ps = new PassengersDetails();
	static Scanner sc = new Scanner(System.in);

	public void displayFlights(String source, String destination, String date) {
		ArrayList<Flight> flights = new ArrayList<>();
		flights.add(new Flight(2356, "AIR INDIA", "Bangalore", "Chennai", "Mon,Thu,Sat", "12:00", "14:30", 80));
		flights.add(new Flight(3001, "AIR ASIA", "Bangalore", "Chennai", "Mon,Tue,Web,Thu,Fri,Sat,Sun", "14:20",
				"17:10", 100));
		flights.add(new Flight(3015, "AIR ASIA", "Bangalore", "Chennai", "Mon,Wed,Sat,Sun", "09:30", "12:00", 100));
		flights.add(new Flight(4036, "INDIGO", "Chennai", "Bangalore", "Mon,Thu,Sat", "10:30", "13:00", 120));
		flights.add(new Flight(3010, "AIR ASIA", "Chennai", "Bangalore", "Mon,Tue,Web,Thu,Fri,Sat,Sun", "14:30",
				"17:00", 100));
		flights.add(new Flight(2023, "AIR INDIA", "Chennai", "Bangalore", "Mon,Wed,Sat,Sun", "05:30", "08:00", 80));

		boolean foundFlight = false;
		boolean validSource = false;
		boolean validDestination = false;
		String dayofDate = DateToDay.getDay(date);
		System.out.println("Day:" + dayofDate);

		for (Flight flight : flights) {
			if (flight.getSource().equalsIgnoreCase(source)) {
				validSource = true;
			}

			if (flight.getDestination().equalsIgnoreCase(destination)) {
				validDestination = true;
			}
		}

		if (validSource && validDestination) {
			System.out.println("Available Flights:");
			System.out.println("*****************************************************************");

			for (Flight flight : flights) {
				if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)
						&& flight.getDateOfJourney().contains(dayofDate)) {

					System.out
							.println("Flight Name |" + " Flight ID   | " + "Arrival Time   | " + "Departure Time   | ");
					System.out.println(flight.getFlightName() + "            " + flight.getFlightId() + "        "
							+ flight.getTimeToDeparture() + "             " + flight.getTimeToReach());

					System.out.println("--------------------------------------------------------------------");
				}
			}
			System.out.println("1.Book Seats");
			System.out.println("2.Exit");

			try {
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter Flight Id:");
					int flightID = sc.nextInt();
					for (Flight flight : flights) {
						if (flight.getFlightId() == flightID) {
							foundFlight = true;
							System.out.println(flight.getTimeToDeparture() + "--------->" + flight.getTimeToReach()
									+ ", Available Seats: " + flight.getAvailableSeats());
							reserveSeat(flight.getFlightId(), flight.getFlightName(), flight.getSource(),
									flight.getDestination(), flight.getTimeToDeparture(), flight.getTimeToReach(),
									flight.getAvailableSeats(),date);
						}
					}
					if (!foundFlight) {
						System.out.println("Invalid FlightID.. Please enter a valid FlightID..");

					}

				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}

		} else {
			System.out.println("No matching flights found for the specified source / destination.");
		}

	}

	public void reserveSeat(int flightID, String flightName, String source, String destination, String departure,
			String arraival, int availableSeats, String date) {
		boolean[] businessClassseats = new boolean[availableSeats / 2];
		boolean[] economicClassseats = new boolean[availableSeats / 2];
		int availableBCseats = businessClassseats.length; // BC-BusinessClass
		int availableECseats = economicClassseats.length; // EC-EconomicClass
		boolean exitReservation = false;
       
		while (!exitReservation) {
			System.out.println("*****SELECT YOUR SEATS*****");
			System.out.println("1.Business class seats");
			System.out.println("2.Economic class seats");
			System.out.println("3.Exit");
			int seatNo;
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Available BusinessClass seats: " + availableBCseats);

				System.out.print("Select seat Number:");
				seatNo = sc.nextInt();
				seat.setSeatNo(seatNo);
				if (seatNo >= 1 && seatNo <= availableBCseats) {
					if (businessClassseats[seatNo - 1] == false) {
						businessClassseats[seatNo - 1] = true;
						availableBCseats--;

						System.out.println("Seat no " + seat.getSeatNo() + "B" + " is reserved for BusinessClass");
						String allotedSeat = seat.getSeatNo() + "B";
						ps.passengersInfo(allotedSeat, flightID, flightName, source, destination, departure, arraival,date);
					} else {
						System.out.println("seat already booked....choose another ");
					}
				} else {
					System.out.println("Invalid seat number. Please choose a valid seat.");
				}
			} else if (choice == 2) {

				System.out.println("Available EconomicClass seats: " + availableECseats);
				System.out.print("Select seat Number:");
				seatNo = sc.nextInt();
				seat.setSeatNo(seatNo);
				if (seatNo >= 1 && seatNo <= availableECseats) {
					if (economicClassseats[seatNo - 1] == false) {
						economicClassseats[seatNo - 1] = true;
						availableECseats--;
						System.out.println("Seat no " + seat.getSeatNo() + "E" + " is reserved EconomicClass");
						String allotedSeat = seat.getSeatNo() + "E";
						ps.passengersInfo(allotedSeat, flightID, flightName, source, destination, departure, arraival, date);
					} else {
						System.out.println("seat already booked....choose another ");
					}
				} else {
					System.out.println("Invalid seat number. Please choose a valid seat.");
				}

			} else if (choice == 3) {
				exitReservation=true;
				break;
				
			} else {
				System.out.println("Invalid choice..");
			}

		}

	}
	
	
}
