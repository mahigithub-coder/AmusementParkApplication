package com.cg.mts.repository;

import java.util.List;

import com.cg.mts.entities.Ticket;
import com.cg.mts.exception.CustomerNotFoundException;
import com.cg.mts.exception.TicketNotFoundException;

public interface ITicketRepository {
	
	public Ticket insertTicketBooking(Ticket ticket)throws TicketNotFoundException;
	public Ticket updateTicketBooking(Ticket ticket)throws TicketNotFoundException;
	public Ticket deleteTicketBooking(int ticketId)throws TicketNotFoundException;
	public List<Ticket> viewAllTicketsCustomer(int customerId) throws CustomerNotFoundException;
	public Ticket calculateBill(int customerId)throws CustomerNotFoundException;

}
