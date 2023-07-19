package com.inventarioApi.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
	private Long Id;
	
	@Column(unique=true)
	private String login;
	
	private String password;
	
	@Column(unique=true)
	private String email;
	
	private String thumbPath;

	public Account() {
	}

	public Account(Long id, String login, String password, String email, String thumbPath) {
		Id = id;
		this.login = login;
		this.password = password;
		this.email = email;
		this.thumbPath = thumbPath;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getThumbPath() {
		return thumbPath;
	}

	public void setThumbPath(String thumbPath) {
		this.thumbPath = thumbPath;
	}
	
	

	
	
	
	
	
}
