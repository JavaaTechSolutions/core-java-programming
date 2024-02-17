package com.jts.bank.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmService {
	AtmDTO atmDTO = new AtmDTO();
	Map<String, Double> statement = new HashMap<>();

	public void getBalance() {
		System.out.println("Available balance is::" + atmDTO.getBalance());
	}

	public void withdrawAmount(double amount) {
		if (amount % 100 != 0) {
			System.out.println("Please enter amount which are multiple of 100.");
			return;
		}

		if (amount > atmDTO.getBalance()) {
			System.out.println("Insufficient balace!!");
			return;
		}

		statement.put("Withdraw -> ", amount);
		atmDTO.setBalance(atmDTO.getBalance() - amount);
		System.out.println("Collect the cash::" + amount);

		getBalance();
	}

	public void depositAmount(double amount) {
		atmDTO.setBalance(atmDTO.getBalance() + amount);
		System.out.println("Depositted successfully::" + amount);

		statement.put("Deposit -> ", amount);
		getBalance();
	}

	public void viewMiniStatement() {
		for (Map.Entry<String, Double> entry : statement.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
