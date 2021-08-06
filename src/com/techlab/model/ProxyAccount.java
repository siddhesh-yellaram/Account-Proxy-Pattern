package com.techlab.model;

public class ProxyAccount implements Account {
	private int id;
	private String name;
	private int balAmount;

	public ProxyAccount(int id, String name, int balAmount) {
		this.id = id;
		this.name = name;
		this.balAmount = balAmount;
	}

	@Override
	public void deposit(int amount) {
		this.balAmount += amount;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getBalAmount() {
		return balAmount;
	}
	
}
