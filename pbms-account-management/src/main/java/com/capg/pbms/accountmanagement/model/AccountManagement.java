package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Account_info")
public class AccountManagement {
	@Id
	private  long  accountId;
	private String accountHolderId;
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	private double accountBalance;
	private double accountIntrest;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate lastUpdated;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
	@JoinColumn(name="customers",referencedColumnName = "accountId")
	private List<Customer> customerDetails=new ArrayList<>();
	public AccountManagement() {
		super();
	}
	public AccountManagement(long accountId, String accountHolderId, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, double accountIntrest, LocalDate lastUpdated,
			List<Customer> customerDetails) {
		super();
		this.accountId = accountId;
		this.accountHolderId = accountHolderId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountIntrest = accountIntrest;
		this.lastUpdated = lastUpdated;
		this.customerDetails = customerDetails;
	}
	@Override
	public String toString() {
		return "AccountManagement [accountId=" + accountId + ", accountHolderId=" + accountHolderId
				+ ", accountBranchId=" + accountBranchId + ", accountType=" + accountType + ", accountStatus="
				+ accountStatus + ", accountBalance=" + accountBalance + ", accountIntrest=" + accountIntrest
				+ ", lastUpdated=" + lastUpdated + ", customerDetails=" + customerDetails + "]";
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderId() {
		return accountHolderId;
	}
	public void setAccountHolderId(String accountHolderId) {
		this.accountHolderId = accountHolderId;
	}
	public String getAccountBranchId() {
		return accountBranchId;
	}
	public void setAccountBranchId(String accountBranchId) {
		this.accountBranchId = accountBranchId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getAccountIntrest() {
		return accountIntrest;
	}
	public void setAccountIntrest(double accountIntrest) {
		this.accountIntrest = accountIntrest;
	}
	public LocalDate getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public List<Customer> getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(List<Customer> customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	 
}
