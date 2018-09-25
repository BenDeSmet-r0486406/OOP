package domain;

import java.util.ArrayList;

public class Bank {
	private ArrayList<SpaarRekening> spaarRekeningen;
	private ArrayList<BankRekening> bankRekeningen;

	public Bank() {
		spaarRekeningen = new ArrayList<SpaarRekening>();
		bankRekeningen = new ArrayList<BankRekening>();
	}

	public void voegSpaarRekeningToe(SpaarRekening rekening) {
		spaarRekeningen.add(rekening);
	}

	public void voegBankRekeningToe(BankRekening rekening) {
		bankRekeningen.add(rekening);
	}

	public String format() {
		String resultaat = "";
		for (SpaarRekening r : spaarRekeningen) {
			resultaat += "\n" + r.format();
		}
		for (BankRekening r : bankRekeningen) {
			resultaat += "\n" + r.format();
		}
		return resultaat;
	}
}