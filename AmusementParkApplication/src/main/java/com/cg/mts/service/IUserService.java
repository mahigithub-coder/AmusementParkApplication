package com.cg.mts.service;

import com.cg.mts.entities.AbstractUser;

public interface IUserService {
	
	
	public AbstractUser validateUser(String username, String password) throws Exception;
	public AbstractUser addUser(AbstractUser user);
	public AbstractUser removeUser(AbstractUser user);
	public AbstractUser updateUser(AbstractUser user);

}
