package com.cg.mts.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Ticket;
import com.cg.mts.exception.AdminNotFoundException;
import com.cg.mts.exception.CustomerNotFoundException;

public interface IAdminRepository {
	
	
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin)throws AdminNotFoundException;
	public Admin deleteAdmin(int adminId)throws AdminNotFoundException;
	public List<Ticket>getAllActivities(int customerId) throws CustomerNotFoundException;
	public List<Ticket>getAllActivities();
	public List<Ticket>getActivitiesCustomerwise()throws CustomerNotFoundException;
	public List<Ticket>getActivitiesDatewise();
	public List<Ticket>getAllActivitiesForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate)throws CustomerNotFoundException;

}
