package domain;

public class BankRekening {
	private String rekeningNummer;
	private double saldo;

	public BankRekening(String rekeningNummer) {
		this(rekeningNummer, 0);
	}

	public BankRekening(String rekeningNummer, double saldo) {
		setRekeningNummer(rekeningNummer);
		setSaldo(saldo);
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

	public double neemOp(double bedrag) {
		setSaldo(getSaldo() - bedrag);
		return bedrag;
	}

	public String format() {
		String resultaat = "Rekeningnummer: " + getRekeningNummer() + "\nSaldo: " + getSaldo();
		resultaat += "\n----------------------------" + "\n";
		return resultaat;
	}
}