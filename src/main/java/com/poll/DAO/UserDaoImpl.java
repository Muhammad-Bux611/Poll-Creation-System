package com.poll.DAO;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.poll.Model.Admin;
import com.poll.Model.User;
@Repository
public class UserDaoImpl implements UserDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//	Method to add the user data in the database
	
	@Transactional
	public int addUser(User user) {
		// TODO Auto-generated method stub
		int saveUser=(Integer)hibernateTemplate.save(user);
		return saveUser;
	}

//	Check the user's detail for the login
	
	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		
		List<User> users = getAllUser();
		if (users!=null) {
			for (User user2 : users) {
				if (user2.getEmail().equals(user.getEmail()) && user2.getPassword().equals(user.getPassword())) {
					return true;
				}
			}
		}else {
			return false;	
		}
		return false;
	}

//	 Get all user from the database
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	@Transactional
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		
		User beforeUser =hibernateTemplate.get(User.class, user.getUserId());
		hibernateTemplate.delete(beforeUser);
		int update =(Integer) hibernateTemplate.save(user);
		if (update!=0) {
			return true;
		}else {
		return false;
	}
	}

	
}
