package com.util.bank;

import java.util.Arrays;

class ATM1 implements Runnable {

	BankAccount b;
	Thread t;

	ATM1(BankAccount b) {
		this.b = b;
		t = new Thread(this, "ATM1");
		t.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				BankOperationUtil.cashDeposite(b, 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

class ATM2 implements Runnable {

	BankAccount b;
	Thread t;

	ATM2(BankAccount b) {
		this.b = b;
		t = new Thread(this, "ATM1");
		t.start();
	}

	public void run() {
		for (int i = 0; i < 29; i++) {
			try {
				Thread.sleep(1000);
				BankOperationUtil.cashWithdrawal(b, 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class ATM {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1234, "Savings", "Pavan", 1000);

		Bank bank = new Bank(Arrays.asList(new BankAccount[] { b1 }), "Kotak", "Bangalore");
		ATM1 atm1 = new ATM1(b1);
		ATM2 atm2 = new ATM2(b1);
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				BankOperationUtil.cashDeposite(b1, 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			atm1.t.join();
			atm2.t.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BankOperationUtil.getBalance(b1);
	}
}
