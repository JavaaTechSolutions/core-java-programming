package com.jts.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) {
		BankService bankService = new BankService();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many customers do you want to add? ");
		int n = sc.nextInt();

		List<Customer> customers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			customers.add(bankService.createCustomer());
		}

		int ch;

		do {
			System.out.println(" ===== Welcome to Banking System =====");
			System.out.println("1. Display all the accounts.");
			System.out.println("2. Search customer by account no.");
			System.out.println("3. Deposit amount");
			System.out.println("4. Withdraw amount");
			System.out.println("5. Exit");
			
			ch = sc.nextInt();
			
			if (ch == 1) {
				bankService.displayAccounts(customers);
			} else if (ch == 2) {
				System.out.print("Enter Account no. : ");
				
				String acctNo = sc.next();
				
				Customer customer = bankService.searchCustomer(customers, acctNo);
				
				if (Objects.nonNull(customer)) {
					bankService.displayAccount(customer);
				} else {
					System.out.println("Customer not found with account no:"+acctNo);
				}
			} else if (ch == 3) {
				System.out.print("Enter Account no. : ");
				
				String acctNo = sc.next();
				
				Customer customer = bankService.searchCustomer(customers, acctNo);
				
				if (Objects.nonNull(customer)) {
					System.out.print("Customer details found. Please enter deposit amount");
					
					long depositAmount = sc.nextLong();
					bankService.deposit(customer, depositAmount);
				} else {
					System.out.println("Customer not found with account no:"+acctNo);
				}
			} else if (ch == 4) {
				System.out.print("Enter Account no. : ");
				
				String acctNo = sc.next();
				
				Customer customer = bankService.searchCustomer(customers, acctNo);
				
				if (Objects.nonNull(customer)) {
					System.out.print("Customer details found. Please enter withdraw amount");
					
					long withdrawAmt = sc.nextLong();
					bankService.withdraw(customer, withdrawAmt);
				} else {
					System.out.println("Customer not found with account no:"+acctNo);
				}
			} else if (ch == 5) {
				System.out.print("Thank you for Banking with us.");
			}

		} while (ch != 5);

		sc.close();
	}

}
