package com.util.bank;

import java.util.List;

public class Bank {
	private List<BankAccount> list;
	private String bankName;
	private String address;
	public Bank(List<BankAccount> list, String bankName, String address) {
		super();
		this.list = list;
		this.bankName = bankName;
		this.address = address;
	}
	public List<BankAccount> getList() {
		return list;
	}
	public void setList(List<BankAccount> list) {
		this.list = list;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
