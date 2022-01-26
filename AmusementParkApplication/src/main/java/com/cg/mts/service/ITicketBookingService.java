package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Ticket;

public interface ITicketBookingService {
	
	public Ticket insertTicketBooking(Ticket ticketBooking);
	public Ticket updateTicketBooking(Ticket ticketBooking);
	public Ticket deleteTicketBooking(int ticketId);
	public List<Ticket> viewAllTicketsCustomer(int customerId);
	public Ticket calculateBill(int customerId);

}
