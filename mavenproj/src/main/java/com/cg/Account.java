package com.cg;

import java.util.Objects;

public class Account {
	// bean class
	// comment
	private int aid;
	private String holder;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int aid, String holder, double balance) {
		super();
		this.aid = aid;
		this.holder = holder;
		this.balance = balance;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", holder=" + holder + ", balance="
				+ balance + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aid, balance, holder);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return aid == other.aid && Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(holder, other.holder);
	}
	
}
