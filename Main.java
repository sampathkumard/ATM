package com.sam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtmOperations operations = new AtmOperationsImpl();
		int cardNumber = 12345;
		int pinNumber = 123;
		System.out.println("Welcome to ATM machine");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ATM card number");
		int atmNumber = sc.nextInt();
		System.out.println("Enter your pin number");
		int atmPin = sc.nextInt();
		if((atmNumber == cardNumber) && (atmPin ==pinNumber)) {
			while(true) {
				System.out.println("1. View Available Balance\n2. Deposit\n3. Withdraw\n4. View Mini Statement\n5.Exit");
				System.out.println("Enter your option");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					operations.viewBalance();
					break;
				case 2: 
					System.out.println("Enter the amount to deposit");
					double depositAmount = sc.nextDouble();
					operations.depositAmount(depositAmount);
					break;
				case 3: 
					System.out.println("Enter the Amount to Withdraw");
					double withdrawAmount = sc.nextDouble();
					operations.withdrawAmount(withdrawAmount);
					break;
				case 4: 
					System.out.println("Your Mini Statement is ");
					operations.miniStatement();
					break;
				case 5: 
					System.out.println("Collect your Card/n Thank you for using the ATM machine");
					System.exit(0);
					break;

				default:
					System.out.println("Choose the correct option");
					break;
				}
			}
		}else {
			System.out.println("You entered incorrect details");
			System.exit(0);
		}
	}

}
