package domain;

public class SpaarRekening {
	private double percentage;
	private String rekeningNummer;
	private double saldo;

	public SpaarRekening(String rekeningNummer, double percentage) {
		setRekeningNummer(rekeningNummer);
		setPercentage(percentage);
		setSaldo(0);
	}

	public String getRekeningNummer() {
		return rekeningNummer;
	}

	private void setRekeningNummer(String rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void stort(double bedrag) {
		setSaldo(getSaldo() + bedrag);
	}

	public void neemOp(double bedrag) {
		setSaldo(getSaldo() - bedrag);
	}

	public double getPercentage() {
		return percentage;
	}

	private void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void schrijfRenteBij() {
		double rente = getSaldo() * getPercentage() / 100;
		setSaldo(getSaldo() + rente);
	}

	public String format() {
		String resultaat = "Rekeningnummer: " + getRekeningNummer() + "\nSaldo: " + getSaldo();
		resultaat += "\nRente: " + getPercentage();
		resultaat += "\n----------------------------" + "\n";
		return resultaat;
	}
}
