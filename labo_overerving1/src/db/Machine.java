package db;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import domain.Product;
import domain.Voeding;

public class Machine {
	String Beschrijving;
	String Locatie;
	Date bijvulDatum;
	UID	uniekeRandomCode;
	ArrayList<Product> producten = new ArrayList<Product>();
	
	public Machine(){
			this.uniekeRandomCode = new UID();
	}
	
	public Machine(String beschrijving, String locatie, Date bijvulDatum) {
		this.setBeschrijving(beschrijving);
		this.setLocatie(locatie);
		this.setBijvulDatum(bijvulDatum);
		this.uniekeRandomCode = new UID();
	}
	
	public String getBeschrijving() {
		return Beschrijving;
	}
	public void setBeschrijving(String beschrijving) {
		Beschrijving = beschrijving;
	}
	public String getLocatie() {
		return Locatie;
	}
	public void setLocatie(String locatie) {
		Locatie = locatie;
	}
	public Date getBijvulDatum() {
		return bijvulDatum;
	}
	public void setBijvulDatum(Date bijvulDatum) {
		this.bijvulDatum = bijvulDatum;
	}
	public UID getUniekeRandomCode() {
		return uniekeRandomCode;
	}
	public ArrayList<Product> getProducten() {
		return producten;
	}
	public void setProducten(ArrayList<Product> producten) {
		this.producten = producten;
	}
	
	public void addProduct(Product p){
		producten.add(p);
	}
	
	public boolean containsProduct(UUID productUID){
		for(Product pr : producten){
			if(pr.getUniekeCode() == productUID){
				return true;
			}
		}
		return false;
	}
	
	public String getSoortProduct(UUID productUID){
		Product product = null;
		for(Product pr : producten){
			if(pr.getUniekeCode() == productUID){
				product = pr;
			}
		}
		if(product instanceof Voeding){
			return ((Voeding) product).getSoort();
		}else{
			return "non-food";
		}
	}
	
	public double getTotaalPrijs(){
		double result = 0;
		for(Product p : producten){
			result += p.getPrijs();
		}
		return result;
	}
	
	public double getTotaalPrijsMinKorting(){
		double result = 0;
		double korting = 0;
		for(Product p : producten){
			result += p.getPrijs();
			korting += (p.getPrijs()/100*p.getKorting());
		}
		return result - korting;
	}
	
	
}
