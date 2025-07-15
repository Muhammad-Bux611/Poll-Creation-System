package com.poll.DAO;

import java.util.List;

import com.poll.Model.Admin;

public interface AdminDAO {
	
	public int addAdmin(Admin admin);
	public List<Admin> getAllAdmins();
	public boolean checkAdmin(Admin admin);

}
