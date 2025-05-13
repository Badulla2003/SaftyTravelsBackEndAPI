package com.booking;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;

import com.booking.model.Bus;
import com.booking.model.Passanger;
import com.booking.model.Route;
import com.booking.repository.BusRepository;
import com.booking.repository.TicketService;
import com.booking.service.BusService;
import com.booking.service.RouteService;
import com.booking.service.TicketBookingService;

@SpringBootApplication
public class BusBookingApplicatio implements CommandLineRunner {
	
    @Autowired
    BusService busService;
    
    @Autowired
    TicketService ts;
    
    @Autowired
     RouteService routeService;
    
    @Autowired
    TicketBookingService ticketBookingService;
    
//    @Autowired
//    private CacheManager cacheManager;
	public static void main(String[] args) {
		SpringApplication.run(BusBookingApplicatio.class, args);

		
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * this is for adding bus

		/*
		 * this is for adding passanger
		 */
//		Passanger p=new Passanger(1, "ram", "j", 2, 234, "ll", "lllk");
//		ticketBookingService.bookTicket(1,11,p);
		
        /*
         * this is for cancelling the seat;
         */
		
	//	Passanger p=new Passanger(2, "ram", "j", 2, 234, "ll", "lllk");
//		Integer i=11;
//		ticketBookingService.cancellTicket(i);
		
		/*
		 * this is for removing bus
		 */
		
//		Integer busID=1;
//		busService.removeBus(busID);
		
		/*
		 * this is for removing route
		 */
//		Integer routeId=1;
//		routeService.remove(routeId);
		
		/*
		 * getBusDat by rotes id
		 */
//		Integer routeId=1;
//		List<Bus> busList=busService.getBusDataByRouteId(routeId);
//		busList.forEach(System.out::println);
		
		
	}

}
