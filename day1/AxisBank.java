package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Over riding");
	}
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		System.out.println(bank);
	}

}
