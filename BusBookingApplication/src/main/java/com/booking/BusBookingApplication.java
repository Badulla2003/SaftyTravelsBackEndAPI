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
import com.booking.service.BusService;
import com.booking.service.RouteService;
import com.booking.service.TicketBookingService;

@SpringBootApplication
public class BusBookingApplication implements CommandLineRunner {
	
    @Autowired
    BusService busService;
    
    @Autowired
     RouteService routeService;
    
    @Autowired
    TicketBookingService ticketBookingService;
    
//    @Autowired
//    private CacheManager cacheManager;
	public static void main(String[] args) {
		SpringApplication.run(BusBookingApplication.class, args);

		
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * this is for adding bus
//		 */
//		Route r=new Route(2,"Vijayavad","Hyderabad","2 PM");
//		Bus b1=new Bus(2,14325,"sleeper",50,10,20,5,10);
//		Bus b2=new Bus(3,14325,"sleeper",50,10,20,5,10);
//		Bus b3=new Bus(4,14325,"sleeper",50,10,20,5,10);
//		
//		b1.setRoute(r);	
//		b2.setRoute(r);
//		b3.setRoute(r);
//		routeService.saveRoute(r);
//		busService.saveBus(b1);
//		busService.saveBus(b2);
//		busService.saveBus(b3);
		
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
