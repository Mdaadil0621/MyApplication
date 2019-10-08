package com.book.ticket.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.ticket.app.dao.TicketDao;
import com.book.ticket.app.entites.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketDao.findByTicketId(ticketId);
		
	
	}
	public void deleteTicketById(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
	public List<Ticket> getAllTickets() {
		return ticketDao.findAll();
		
	}

	

}
