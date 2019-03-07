package com.util.bank;

public class BankAccount {
	private int accountNumber;
	private String AccountType;
	private String AccountHolder;
	private double balance;
	public BankAccount(int accountNumber, String accountType, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		AccountType = accountType;
		AccountHolder = accountHolder;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
