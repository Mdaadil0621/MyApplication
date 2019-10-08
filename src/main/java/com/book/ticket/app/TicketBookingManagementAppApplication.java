package com.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.book.ticket.app.entites.Ticket;
import com.book.ticket.app.service.TicketService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	
		/*
		 * TicketService ticketService =
		 * ctxt.getBean("ticketService",TicketService.class); Ticket ticket = new
		 * Ticket(); ticket.setPassengerName("Sweta");
		 * ticket.setSourceStation("Bhagalpur");
		 * ticket.setDestinationStation("Banglore"); ticket.setBookingData(new Date());
		 * ticket.setEmail("sweta01@gmail.com");
		 * 
		 * ticketService.createTicket(ticket);
		 */
		 
	}

}
