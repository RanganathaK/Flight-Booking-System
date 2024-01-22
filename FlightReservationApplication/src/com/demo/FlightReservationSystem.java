package com.demo;

import java.util.Scanner;

public class FlightReservationSystem {

	FlightDetails flightDetails=new FlightDetails();
	UserService userService = new UserService();


	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********************LOGIN*********************");
        login(sc);
		while (true) {
			displayMenu();

			int choice = sc.nextInt();


			switch (choice) {

			case 1:
				searchFlight(sc);
				break;
			case 2:
				makeReservation(sc);
				break;
			case 3:
				viewBookingDetails();
				break;
			case 4:
				System.out.println("Exiting the system..");
				System.exit(0);
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	public void login(Scanner sc) {
		System.out.println("Enter UserName: ");
		String userName = sc.next();
		System.out.println("Enter PassWord: ");
		String passWord = sc.next();
		userService.verifyUser(userName, passWord);

	}

	private void searchFlight(Scanner sc) {
		System.out.println("From:");
		String source = sc.next();
		System.out.println("To:");
		String destination = sc.next();

		flightDetails.displayFlights(source, destination);

	}

	private void viewBookingDetails() {

	}

	private void makeReservation(Scanner sc) {

	}

	private void displayMenu() {

		System.out.println("1. Search Flights");
		System.out.println("2. Make Reservation");
		System.out.println("3. View Booking Details");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
	}

	
	public static void main(String[] args) {
		FlightReservationSystem system = new FlightReservationSystem();
		system.run();
	}
}