package com.vj.news.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Embeddable
@Table(name = "t_user_details")
public class UserDetails {
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	private String email;
	private String userName;
	@JsonIgnore
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public UserType getUserType() {
		return userType;
	}
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	

}
