package bank;

import jdk.jshell.spi.ExecutionControl.UserException;

public abstract class Account {
	double interestRate;
	double amount;
	 public Account(double amount) throws Userdef {
	        if (amount < 0) {
	            throw new Userdef("Invalid amount. Please enter a positive value.");
	        }
	        this.amount = amount;
	    }
    
	abstract double calculateInterest();
}
