package com.demo;

import java.util.List;
import java.util.Scanner;

public class FlightReservationSystem {

	FlightDetails flightDetails = new FlightDetails();
	UserService userService = new UserService();
	Scanner sc = new Scanner(System.in);
	int choice;

	public void run() {

		// User Login
		userService.verifyUser(); // check the user is already exist in the system
		while (true) {
			displayMenu();

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				searchFlight(sc);
				break;
			case 2:
				viewBookingDetails();
				break;
			case 3:
				System.out.println("Exiting the system..");
				System.exit(0);

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void searchFlight(Scanner sc) {
		System.out.println("From:");
		String source = sc.next();
		System.out.println("To:");
		String destination = sc.next();
		System.out.println("Date of Journey(dd/mm/yyyy):");
		String date = sc.next();
		

		flightDetails.displayFlights(source, destination, date);

	}

	public void viewBookingDetails() {
		int ticketId;
		List<Ticket> bookedTickets = MyBookings.getAllBookedTickets();

		if (bookedTickets.isEmpty()) {
			System.out.println("No Records Found...");
		} else {
			System.out.println("Booked Tickets:");
			for (Ticket ticket : bookedTickets) {
				System.out.println(ticket);
			}
			System.out.println("1.Cancel Ticket");
			System.out.println("2.Exit");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter TicketID to cancel:");
				ticketId = sc.nextInt();
				MyBookings.cancelTicket(ticketId);
			}
		}

	}

	public void displayMenu() {

		System.out.println("1. Search Flights");
		System.out.println("2. View Booking Details");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
	}

	public static void main(String[] args) {
		FlightReservationSystem system = new FlightReservationSystem();
		system.run();
	}
}