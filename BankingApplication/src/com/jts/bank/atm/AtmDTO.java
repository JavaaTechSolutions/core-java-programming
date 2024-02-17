package com.jts.bank.atm;

public class AtmDTO {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

}
