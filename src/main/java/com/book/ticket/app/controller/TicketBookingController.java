package com.book.ticket.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.ticket.app.entites.Ticket;
import com.book.ticket.app.service.TicketService;

@Controller
//@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketService ticketService;
	
	/*
	 * @PostMapping(value = "/create") public Ticket createTicket(@RequestBody
	 * Ticket ticket) { return ticketService.createTicket(ticket); }
	 */
	@RequestMapping(value = "/showForm.htm")
	public String showTicketForm(Model model) {
		 model.addAttribute("ticket", new Ticket());
		 return "ticketForm";
	}
/*		
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketService.getTicketById(ticketId);
		
	}
	
	@DeleteMapping(value = "/delete/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId")Integer ticketId) {
		ticketService.deleteTicketById(ticketId);
	}
	
	@GetMapping(value = "/allTicket")
	public List<Ticket> getAllTicket(){
		return ticketService.getAllTickets();
	}
	*/

}
