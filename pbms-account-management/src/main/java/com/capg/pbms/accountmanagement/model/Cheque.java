package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;

public class Cheque {
	private String chequeId;
	private int chequeNum;
	private String chequeAccountNo;
	private String chequeHolderName;
	private String chequeBankName;
	private String chequeIFSC;
	private LocalDate chequeIssueDate;
	private String chequeStatus;
	public Cheque(String chequeId, int chequeNum, String chequeAccountNo, String chequeHolderName,
			String chequeBankName, String chequeIFSC, LocalDate chequeIssueDate, String chequeStatus) {
		super();
		this.chequeId = chequeId;
		this.chequeNum = chequeNum;
		this.chequeAccountNo = chequeAccountNo;
		this.chequeHolderName = chequeHolderName;
		this.chequeBankName = chequeBankName;
		this.chequeIFSC = chequeIFSC;
		this.chequeIssueDate = chequeIssueDate;
		this.chequeStatus = chequeStatus;
	}
	public String getChequeId() {
		return chequeId;
	}
	public void setChequeId(String chequeId) {
		this.chequeId = chequeId;
	}
	public int getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(int chequeNum) {
		this.chequeNum = chequeNum;
	}
	public String getChequeAccountNo() {
		return chequeAccountNo;
	}
	public void setChequeAccountNo(String chequeAccountNo) {
		this.chequeAccountNo = chequeAccountNo;
	}
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	public String getChequeBankName() {
		return chequeBankName;
	}
	public void setChequeBankName(String chequeBankName) {
		this.chequeBankName = chequeBankName;
	}
	public String getChequeIFSC() {
		return chequeIFSC;
	}
	public void setChequeIFSC(String chequeIFSC) {
		this.chequeIFSC = chequeIFSC;
	}
	public LocalDate getChequeIssueDate() {
		return chequeIssueDate;
	}
	public void setChequeIssueDate(LocalDate chequeIssueDate) {
		this.chequeIssueDate = chequeIssueDate;
	}
	public String getChequeStatus() {
		return chequeStatus;
	}
	public void setChequeStatus(String chequeStatus) {
		this.chequeStatus = chequeStatus;
	}
	
}
