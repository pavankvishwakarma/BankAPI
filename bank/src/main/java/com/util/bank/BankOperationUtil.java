package com.util.bank;

public class BankOperationUtil {

	public static synchronized boolean cashDeposite(BankAccount bankAccount, double balance) {
		double bal=bankAccount.getBalance();
		if(balance>0) {
			bankAccount.setBalance(bal+balance);
			System.out.println(Thread.currentThread().getName()+" "+bankAccount.getAccountNumber()+" "+balance+" "+ "credited!");
			return true;
		}else {
			return false;
		}

	}

	public static double getBalance(BankAccount bankAccount) {
		System.out.println("The balance is "+bankAccount.getBalance());
		return bankAccount.getBalance();
	}

	public synchronized static boolean cashWithdrawal(BankAccount bankAccount, double balance) {
		double bal=bankAccount.getBalance();
		if(bal>=balance) {
			bankAccount.setBalance(bal-balance);
			System.out.println(Thread.currentThread().getName()+" "+bankAccount.getAccountNumber()+" "+balance+" "+ "debited!");
			return true;
		}else {
			return false;
		}

	}



}
