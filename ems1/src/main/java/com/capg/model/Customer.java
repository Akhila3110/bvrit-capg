package com.capg.model;

import java.util.Date;

public class Customer {
	private String customerName;
	private String customerAccountNo;
	private String customerContact;
	private String customerAdhar;
	private String customerPan;
	private Date customerDob;
	private String customerGender;
	private String customerPass;
	private String customerUserName;
	private String customerEmail;
	private boolean status;
	private Address customerAddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String customerAccountNo, String customerContact, String customerAdhar,
			String customerPan, Date customerDob, String customerGender, String customerPass, String customerUserName,
			String customerEmail, boolean status, Address customerAddress) {
		super();
		this.customerName = customerName;
		this.customerAccountNo = customerAccountNo;
		this.customerContact = customerContact;
		this.customerAdhar = customerAdhar;
		this.customerPan = customerPan;
		this.customerDob = customerDob;
		this.customerGender = customerGender;
		this.customerPass = customerPass;
		this.customerUserName = customerUserName;
		this.customerEmail = customerEmail;
		this.status = status;
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAccountNo=" + customerAccountNo
				+ ", customerContact=" + customerContact + ", customerAdhar=" + customerAdhar + ", customerPan="
				+ customerPan + ", customerDob=" + customerDob + ", customerGender=" + customerGender
				+ ", customerPass=" + customerPass + ", customerUserName=" + customerUserName + ", customerEmail="
				+ customerEmail + ", status=" + status + ", customerAddress=" + customerAddress + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAccountNo == null) ? 0 : customerAccountNo.hashCode());
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerAdhar == null) ? 0 : customerAdhar.hashCode());
		result = prime * result + ((customerContact == null) ? 0 : customerContact.hashCode());
		result = prime * result + ((customerDob == null) ? 0 : customerDob.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerGender == null) ? 0 : customerGender.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPan == null) ? 0 : customerPan.hashCode());
		result = prime * result + ((customerPass == null) ? 0 : customerPass.hashCode());
		result = prime * result + ((customerUserName == null) ? 0 : customerUserName.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAccountNo == null) {
			if (other.customerAccountNo != null)
				return false;
		} else if (!customerAccountNo.equals(other.customerAccountNo))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerAdhar == null) {
			if (other.customerAdhar != null)
				return false;
		} else if (!customerAdhar.equals(other.customerAdhar))
			return false;
		if (customerContact == null) {
			if (other.customerContact != null)
				return false;
		} else if (!customerContact.equals(other.customerContact))
			return false;
		if (customerDob == null) {
			if (other.customerDob != null)
				return false;
		} else if (!customerDob.equals(other.customerDob))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerGender == null) {
			if (other.customerGender != null)
				return false;
		} else if (!customerGender.equals(other.customerGender))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPan == null) {
			if (other.customerPan != null)
				return false;
		} else if (!customerPan.equals(other.customerPan))
			return false;
		if (customerPass == null) {
			if (other.customerPass != null)
				return false;
		} else if (!customerPass.equals(other.customerPass))
			return false;
		if (customerUserName == null) {
			if (other.customerUserName != null)
				return false;
		} else if (!customerUserName.equals(other.customerUserName))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAccountNo() {
		return customerAccountNo;
	}
	public void setCustomerAccountNo(String customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAdhar() {
		return customerAdhar;
	}
	public void setCustomerAdhar(String customerAdhar) {
		this.customerAdhar = customerAdhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public Date getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerPass() {
		return customerPass;
	}
	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}
	public String getCustomerUserName() {
		return customerUserName;
	}
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

		
}