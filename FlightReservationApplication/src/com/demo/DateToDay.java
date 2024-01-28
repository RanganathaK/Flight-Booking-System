package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateToDay {
	static String dayofweek;

	public static String getDay(String userInput) {
		LocalDate today = LocalDate.now();
		//System.out.println("today:" + today);
		SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
		// Format today's date using a specific pattern
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//String formattedDate = today.format(formatter);
		//System.out.println(formattedDate);
		Date userdate;

		try {
			userdate = sd.parse(userInput);
			LocalDate userDate = LocalDate.parse(userInput, formatter);
			// Compare today's date with the user-entered date
			if (today.isBefore(userDate)) {
				Calendar c = Calendar.getInstance();
				c.setTime(userdate);
				dayofweek = new SimpleDateFormat("EE").format(userdate);
				 //System.out.println("The day of user entered date:" + dayofweek);
			} else {
				System.out.println("Invalid Date");
			}
		} catch (DateTimeParseException|ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format dd/mm/yyyy.");
        }
		return dayofweek;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a date (dd/mm/yyyy): ");
		String userInput = sc.nextLine();
		getDay(userInput);
	}
}
