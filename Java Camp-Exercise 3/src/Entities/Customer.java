package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	int dateOfBirth;
	long nationallityId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getNationallityId() {
		return nationallityId;
	}
	public void setNationallityId(long nationallityId) {
		this.nationallityId = nationallityId;
	}
}
