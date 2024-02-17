package com.jts.bank;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BankService {
	Scanner sc = new Scanner(System.in);

	public Customer createCustomer() {
		Customer customer = new Customer();

		System.out.print("Enter account no:");
		customer.setAcctNo(sc.next());

		System.out.print("Enter account type:");
		customer.setAcctType(sc.next());

		System.out.print("Enter name:");
		customer.setName(sc.next());

		System.out.print("Enter balance:");
		customer.setBalance(sc.nextLong());

		return customer;
	}
	
	public void displayAccounts(List<Customer> customers) {
		for (Customer userInfo : customers) {
			displayAccount(userInfo);
		}
	}

	public void displayAccount(Customer userInfo) {
		System.out.println("Name of account holder: " + userInfo.getName());
		System.out.println("Account no.: " + userInfo.getAcctNo());
		System.out.println("Account type: " + userInfo.getAcctType());
		System.out.println("Balance: " + userInfo.getBalance());
	}
	
	public Customer searchCustomer(List<Customer> customers, String acctNo) {
		Optional<Customer> optional=  customers.stream().filter(c -> c.getAcctNo().equals(acctNo)).findAny();
		
		if (optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}
	
	public void deposit(Customer customer, long depositAmount) {
		customer.setBalance(customer.getBalance() + depositAmount);
	}
	
	public void withdraw(Customer customer, long withdrawAmt) {
		if (customer.getBalance() < withdrawAmt) {
			System.out.println("Your balance is less than " + withdrawAmt + " Transaction failed..!!");
		} else {
			customer.setBalance(customer.getBalance()  - withdrawAmt);
			System.out.println("Balance after withdrawal: " + customer.getBalance());
		}
	}
}
