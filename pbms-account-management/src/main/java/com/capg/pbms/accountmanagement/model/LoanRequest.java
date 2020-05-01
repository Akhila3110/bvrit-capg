package com.capg.pbms.accountmanagement.model;

public class LoanRequest {
	private String loanRequestId;
	private String loanCustomerId;
	private Double loanAmount;
	private String loanType;
	private int loanTenure;
	private Double loanRoi;
	private String loanStatus;
	private Double loanEmi;
	private int CreditScore;
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}
	public String getLoanCustomerId() {
		return loanCustomerId;
	}
	public void setLoanCustomerId(String loanCustomerId) {
		this.loanCustomerId = loanCustomerId;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public Double getLoanRoi() {
		return loanRoi;
	}
	public void setLoanRoi(Double loanRoi) {
		this.loanRoi = loanRoi;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Double getLoanEmi() {
		return loanEmi;
	}
	public void setLoanEmi(Double loanEmi) {
		this.loanEmi = loanEmi;
	}
	public int getCreditScore() {
		return CreditScore;
	}
	public void setCreditScore(int creditScore) {
		CreditScore = creditScore;
	}
	
}
