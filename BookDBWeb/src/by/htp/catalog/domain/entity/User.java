package by.htp.catalog.domain.entity;

import java.util.Date;

public class User {

	private String surname;
	private String name;
	private Date date;

	public User() {

	}

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		this.date = new Date();
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
