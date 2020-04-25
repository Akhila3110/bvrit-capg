package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;

public class Customer {
	private String customerId;
	private String customerName;
	private Address customerAddress;
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	private LocalDate CustomerDob;
	 
	
	public Customer() {
		
	}


	public Customer(String customerId, String customerName, Address customerAddress, String customerAadhar,
			String customerPan, String customerContact, String customerGender, LocalDate customerDob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		CustomerDob = customerDob;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerAadhar() {
		return customerAadhar;
	}


	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}


	public String getCustomerPan() {
		return customerPan;
	}


	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}


	public String getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}


	public String getCustomerGender() {
		return customerGender;
	}


	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}


	public LocalDate getCustomerDob() {
		return CustomerDob;
	}


	public void setCustomerDob(LocalDate customerDob) {
		CustomerDob = customerDob;
	}


	 
}
