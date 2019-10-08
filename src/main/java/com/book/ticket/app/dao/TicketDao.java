package com.book.ticket.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.ticket.app.entites.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {

	public Ticket findByTicketId(Integer Id);
	

}
