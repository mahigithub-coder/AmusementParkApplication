package com.cg.mts.service;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.mts.entities.Activity;
import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Ticket;

public interface IAdminService {
	
	
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(int adminId);
	public List<Ticket> getAllActivities(int customerId);
	public List<Ticket> getAllActivities();
	public List<Ticket> getActivitiesCustomerwise();
	public List<Ticket> getActivitiesDatewise();
	public List<Ticket> getAllActivitiesForDays(int customerId,LocalDateTime fromDate,LocalDateTime toDate);
	
	
	

}
