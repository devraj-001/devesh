package com.shu.kart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(nullable=false, length=45, name="first_name")
	private String firstname;
	
	@Column(nullable=false, length=45, name="last_name")
	private String lastname;
	
	@Column(nullable=false, unique=true, length=45, name="pwd")
	private String password;
	
	@Column(nullable=false, length=45, name="Gender")
	private String gender;
	
	@Column(nullable=false, unique=true, length=45, name="email")
	private String email;
	
	@Column(nullable=false, length=45, name="dob")
	private String dob;
	
	@Column(nullable=false, length=45, name="Country")
	private String country;
	
	@Column(nullable=false, length=45, unique=true, name="contact_number")
	private long mobile;
	
	@Column(nullable=false, length=45, name="website")
	private String website;

	public User() 
	{
		
	}

	public User(String firstname, String lastname, String gender, String email, String dob, String country, long mobile,
			String website) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.country = country;
		this.mobile = mobile;
		this.website = website;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", email=" + email + ", password="+password+ ", dob=" + dob + ", country=" + country + ", mobile=" + mobile + ", website="
				+ website + "]";
	}
	
	
	
	
	
	
}