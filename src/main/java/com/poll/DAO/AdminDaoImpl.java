package com.poll.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.poll.Model.Admin;

@Repository
public class AdminDaoImpl implements AdminDAO{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public AdminDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
//	 Method to save the admin data to the database
	
	@Transactional
	public int addAdmin(Admin admin) {

		int save = (Integer)hibernateTemplate.save(admin);
		return save;
	}
	
//	 Method to get all the registered admins 
	
	public List<Admin> getAllAdmins(){
		List<Admin> admins= hibernateTemplate.loadAll(Admin.class);
		return admins;
	}
	
//	Method to check either this email and password is present for the admin or not
	
	@Override
	public boolean checkAdmin(Admin admin) {
		boolean isPresent=false;
		// TODO Auto-generated method stub
		List<Admin> admins = hibernateTemplate.loadAll(Admin.class);
		if (admins!=null) {
			for (Admin admin2 : admins) {
				if (admin2.getEmail().equals(admin.getEmail())) {
					if (admin2.getPassword().equals(admin.getPassword())) {

						isPresent = true;
					}
				}
			}
		}else {

			isPresent=false;
		}
		return isPresent;
	}
	

}
