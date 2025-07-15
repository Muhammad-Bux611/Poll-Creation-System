package com.poll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poll.DAO.AdminDAO;
import com.poll.DAO.AdminDaoImpl;
import com.poll.Model.Admin;
@Service
public class AdminService {
	
	@Autowired
	AdminDAO dao;
	


	public AdminService() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int registerAdmin(Admin admin) {
		
		List<Admin> admins=dao.getAllAdmins();
		if (admins!=null) {
			for (Admin getAdmin : admins) {
				if (getAdmin.getEmail().equals(admin.getEmail())) {
					
					return 0;
				}
				
			}
		}else {
			int save = (Integer)dao.addAdmin(admin);
			return save;
		}

		
		int saved = dao.addAdmin(admin);
		
		return saved;
	}
	
	public boolean isLogin(Admin admin) {
		boolean isLogin = dao.checkAdmin(admin);
		if (isLogin) {
			return true;
		}else {
			return false;
		}
	}

}
