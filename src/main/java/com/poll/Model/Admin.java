package com.poll.Model;

import java.sql.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	private String name;
	private String lastName;
	private String dob;
	private String email;
	private String password;


	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId, String name, String lastName, String dob, String email, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.password=password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", lastName=" + lastName + ", dob=" + dob + ", email="
				+ email + ", password=" + password + "]";
	}
	

}
