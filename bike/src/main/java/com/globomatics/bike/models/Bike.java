package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	
	@Column
	private String model;
	
	@Column
	private String serialNumber;
	
	@Column
	private BigDecimal purchasePrice;
	
	@Column
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern= "MM-dd-yyyy")
	private Date purchaseDate;
	
	@Column
	private boolean contact;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String name, String email, String phone, String model, String serialNumber, BigDecimal purchasePrice,
			Date purchaseDate, boolean contact) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.model = model;
		this.serialNumber = serialNumber;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.contact = contact;
	}		
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", email=" + email + ", phone=" + phone + ", model=" + model + ", serialNumber="
				+ serialNumber + ", purchasePrice=" + purchasePrice + ", purchaseDate=" + purchaseDate + ", contact="
				+ contact + "]";
	}
	
	
	
	

}
