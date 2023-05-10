package com.hccs.advweb;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String make;
	private String model;
	private String year;
	private String plate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String firstname, String lastname) {
		setId(id);
		setFirstname(firstname);
		setLastname(lastname);		
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", email="
				+ email + ", make=" + make + ", model=" + model + ", year=" + year + ", plate=" + plate
				+ ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getMake()="
				+ getMake() + ", getModel()=" + getYear() + ", getYear()=" + getYear() + ", getPlate()=" + getPlate()
				+ "]";
	}
	
	

}
