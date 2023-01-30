package com.sam;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationsImpl implements AtmOperations{
	
	Atm atm = new Atm();
	Map<Double, String> mini = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available balance is " + atm.getBalance());
	}

	@Override
	public void depositAmount(double depositAmount) {
		mini.put(depositAmount, " Amount Deposited ");
		System.out.println(depositAmount + " Deposited Successfully !!");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance()) {
			mini.put(withdrawAmount, " Amount Withdrawn ");
			System.out.println(withdrawAmount + " Withdraw Successfully!!! ");
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}else {
			System.out.println("Insufficient balance");
		}
	    
	}
	@Override
	public void miniStatement() {
		for(Map.Entry<Double, String> m: mini.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		viewBalance();
	}
	
	

}
