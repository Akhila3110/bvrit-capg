package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;

public class AccountManagement {
	private String accountId;
	private String accountHolderId;
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	private Double accountBalance;
	private Double accountIntrest;
	private LocalDate lastUpdated;
	
	public AccountManagement(String accountId, String accountHolderId, String accountBranchId, String accountType,
			String accountStatus, Double accountBalance, Double accountIntrest, LocalDate lastUpdated) {
		super();
		this.accountId = accountId;
		this.accountHolderId = accountHolderId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountIntrest = accountIntrest;
		this.lastUpdated = lastUpdated;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
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
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Double getAccountIntrest() {
		return accountIntrest;
	}
	public void setAccountIntrest(Double accountIntrest) {
		this.accountIntrest = accountIntrest;
	}
	public LocalDate getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	 
}
