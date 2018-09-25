package ui;

import domain.*;

public class BankApp {
	public static void main(String[] args) {
		Bank bank = new Bank();
		BankRekening bankRekening = new BankRekening("1234567890");
		bank.voegBankRekeningToe(bankRekening);
		SpaarRekening spaarRekening = new SpaarRekening("0987654321", 2.1);
		bank.voegSpaarRekeningToe(spaarRekening);
		System.out.println(bank.format());
	}
}
