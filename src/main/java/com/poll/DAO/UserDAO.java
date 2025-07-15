package com.poll.DAO;

import java.util.List;

import com.poll.Model.Admin;
import com.poll.Model.User;

public interface UserDAO {
	public int addUser(User user);
	public boolean loginUser(User user);
	public List<User> getAllUser();
//	public User getUserByEmail(String email);
	public boolean updateUser(User user);
		
}
