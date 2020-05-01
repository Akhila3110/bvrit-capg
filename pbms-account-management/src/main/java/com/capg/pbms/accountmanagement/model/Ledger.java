package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;

public class Ledger {
	private String ledgerId;
	private LocalDate ledgerDate;
	private double ledgerDebitAmount;
	private double ledgerCreditAmount;
	private int ledgerNumOfLoans;
	private double ledgerTotalLoanAmount;
	public String getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
	}
	public LocalDate getLedgerDate() {
		return ledgerDate;
	}
	public void setLedgerDate(LocalDate ledgerDate) {
		this.ledgerDate = ledgerDate;
	}
	public double getLedgerDebitAmount() {
		return ledgerDebitAmount;
	}
	public void setLedgerDebitAmount(double ledgerDebitAmount) {
		this.ledgerDebitAmount = ledgerDebitAmount;
	}
	public double getLedgerCreditAmount() {
		return ledgerCreditAmount;
	}
	public void setLedgerCreditAmount(double ledgerCreditAmount) {
		this.ledgerCreditAmount = ledgerCreditAmount;
	}
	public int getLedgerNumOfLoans() {
		return ledgerNumOfLoans;
	}
	public void setLedgerNumOfLoans(int ledgerNumOfLoans) {
		this.ledgerNumOfLoans = ledgerNumOfLoans;
	}
	public double getLedgerTotalLoanAmount() {
		return ledgerTotalLoanAmount;
	}
	public void setLedgerTotalLoanAmount(double ledgerTotalLoanAmount) {
		this.ledgerTotalLoanAmount = ledgerTotalLoanAmount;
	}
}
