package com.poll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poll.DAO.UserDAO;
import com.poll.Model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public int isSaved(User user) {
		int saved= dao.addUser(user);
		return saved;
	}
	
	
	public boolean isLogin(User user) {
		boolean isLogin = dao.loginUser(user);
		if (isLogin) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<User> getAllUsers(){
		return dao.getAllUser();
	}
	
	
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		List<User> users = getAllUsers();
		if (users!=null) {
			for (User user : users) {
				if (user.getEmail().equals(email)) {
					return user;
				}
			}
		}
		
		return null;
	}
	
	public boolean isUpdate(User user) {
		boolean updateUser = dao.updateUser(user);
		if (updateUser) {
			return true;
		}else{
			return false;
		}
	}


}
