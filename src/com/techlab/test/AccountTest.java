package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.ProxyAccount;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new ProxyAccount(101,"Abc",5000);
		long startTime = System.currentTimeMillis();
		System.out.println("Before Deposit: "+startTime);
		acc.deposit(3000);
		long endTime = System.currentTimeMillis();
		System.out.println("After Deposit: "+endTime);
		printInfo(acc);
	}
	
	public static void printInfo(Account acc) {
		System.out.println("Id: "+acc.getId());
		System.out.println("Name: "+acc.getName());
		System.out.println("Balance: "+acc.getBalAmount());
	}

}
