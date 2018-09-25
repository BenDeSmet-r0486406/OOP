package domain;

import java.util.Date;
import java.util.UUID;

public class Product {
	private String beschrijving;
	private UUID uniekeCode;
	private double prijs;
	private Date vervaldatum;
	private int korting;
	
	public Product(String beschrijving, double prijs, Date vervaldatum, int korting) {
		this.setBeschrijving(beschrijving);
		this.uniekeCode = UUID.randomUUID();
		this.setPrijs(prijs);
		this.setVervaldatum(vervaldatum);
		this.setKorting(korting);
	}
	
	public Product(String beschrijving, double prijs, Date vervaldatum) {
		this.setBeschrijving(beschrijving);
		this.uniekeCode = UUID.randomUUID();
		this.setPrijs(prijs);
		this.setVervaldatum(vervaldatum);
	}
	
	public Product(String beschrijving, double prijs, int korting) {
		this.setBeschrijving(beschrijving);
		this.uniekeCode = UUID.randomUUID();
		this.setPrijs(prijs);
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public UUID getUniekeCode() {
		return uniekeCode;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public Date getVervaldatum() {
		return vervaldatum;
	}

	public void setVervaldatum(Date vervaldatum) {
		this.vervaldatum = vervaldatum;
	}

	public int getKorting() {
		return korting;
	}

	public void setKorting(int korting) {
		this.korting = korting;
	}
	
	@Override
	public String toString(){
		return this.beschrijving + " heeft een prijs van " + this.prijs + " euro, een vervaldatum " +  this.vervaldatum + " en zijn unieke code is " + this.uniekeCode ;
	}
	
	

}
