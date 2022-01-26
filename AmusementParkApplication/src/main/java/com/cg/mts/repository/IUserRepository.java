package com.cg.mts.repository;

import com.cg.mts.entities.AbstractUser;

public interface IUserRepository {
	
	public AbstractUser validateUser(String username, String password) throws Exception;
	public AbstractUser addUser(AbstractUser user);
	public AbstractUser removeUser(AbstractUser user);
	public AbstractUser updateUser(AbstractUser user);

}
