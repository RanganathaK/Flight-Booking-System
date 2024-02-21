package com.Application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Application.Entity.Flight;
import com.Application.Service.FlightDetailsService;

@RestController
@RequestMapping("/")
public class FlightController {

	@Autowired
	FlightDetailsService fligthDetailsService;
	
	@GetMapping("/flights")
	public List<Flight> getFlights(@RequestParam String source, @RequestParam String destination, @RequestParam String date_of_journey){
		return fligthDetailsService.getAvailableFlights(source, destination, date_of_journey);
	}
	
}
