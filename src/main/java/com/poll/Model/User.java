package com.poll.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userName;
	private String userCaste;
	private String dob;
	private String email;
	private String password;
	

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Vote>votes;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	User(String userName){
		this.userName=userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCaste() {
		return userCaste;
	}

	public void setUserCaste(String userCaste) {
		this.userCaste = userCaste;
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

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCaste=" + userCaste + ", dob=" + dob
				+ ", email=" + email + ", password=" + password + "]";
	}

	
}
