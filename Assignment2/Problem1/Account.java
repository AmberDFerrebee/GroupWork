package Problem1;

import java.util.*;
import java.text.*;

// Chapter 9 Programming exercise 
// exercise 9.7
// requirements:
// write an Account class
			// private int data field named id, default 0
			// private double data field named balance, default 0
			// private double data named annualInterestRate, default 0
				// assume all accounts have the same rate
			// private Date data field name dateCreated
			// a no-arg constructor that creates default object
			// a constructor that creates an object with specified id and balance
			// getter and putter methods for id, balance, and annualInterestRate
			// getter method for dateCreated
			// method named getMonthlyInterestRate() that returns monthly interest rate
			// method named getMonthlyInterest() that returns the monthly interest
			// method named withdraw that subtracts a specified amount from the balance
			// method named deposit that adds a specified amount to the balance

public class Account {
	
	// created this final variable so that the initial date is finalized
	private Date today = new Date();
	// required data field, default is 0
	private int id; 
	// required data field, default is 0
	private double balance; 
	// required data field, default is 0
	private double annualInterestRate; 
	// required data field, default is 0
	private Date dateCreated = today; 
	
	// required method to perform withdrawals
	public void withdraw(double amount) { 
		this.balance = this.balance - amount;
	}
	// required method to perform deposits
	public void deposit(double amount) { 
		this.balance = this.balance + amount;
	}
	// required method to return interest rate
	public double getMonthlyInterestRate() { 
		double monthlyIntRate = this.annualInterestRate/12;
		return monthlyIntRate;
	}
	// required method to return interest 
	public double getMonthlyInterest() { 
		double monthlyInt = this.balance * getMonthlyInterestRate();
		return monthlyInt;
	}
	// required method to return date created in String format
	public String getDateCreated() { 
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String dateToStr = format.format(this.dateCreated);
		return dateToStr;
	}
	// required getter method to return private data field 
	public int getId() { 
		return this.id;
	}
	// required setter method to set private data field
	public void setId(int newId) { 
		this.id = newId;
	}
	// required getter method to return private data field
	public double getBal() { 
		return this.balance;
	}
	// required setter method to set private data field
	public void setBal(double newBal) { 
		this.balance = newBal;
	}
	// required getter method to return private data field
	public double getIntRate() { 
		return this.annualInterestRate;
	}
	// required setter method to set private data field
	public void setIntRate() { 
		this.annualInterestRate = .045;
	}
	// required constructor that accepts specified data field values
	public Account(int id, double startingBal) { 
		this.id = id;
		this.balance = startingBal;
		setIntRate();
	}
	// required no-args constructor 
	public Account() { 
		setIntRate();
	}
}
