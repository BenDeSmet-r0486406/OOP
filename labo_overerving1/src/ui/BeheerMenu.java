package ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.swing.JOptionPane;

import db.Machine;
import domain.*;

public class BeheerMenu {
	
	Machine machine = new Machine();
	
	public BeheerMenu() throws ParseException{
		String vervaldatumE = ("20 05 1995");
		DateFormat dfe = new SimpleDateFormat("DD MM yyyy");
	    Date dateVervaldatumE =  dfe.parse(vervaldatumE);
		Product product1 = new Voeding("appel", 1.2, dateVervaldatumE, "snack", 10 , 21);
		Product product2 = new Voeding("jupiler NA", 1.5, dateVervaldatumE, "non-alcoholische drank", 145 , 5);
		Product product3 = new NonVoedsel("uw mama's dildo", 0.01, true);
		machine.addProduct(product1);
		machine.addProduct(product2);
		machine.addProduct(product3);
		
		String menu = createMenu();
		int keuze = -1;
		while(keuze != 0){
			String input = JOptionPane.showInputDialog(menu);
			try{
				keuze = Integer.parseInt(input);
				dispatch(keuze);
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
	
	private String createMenu(){
		return "1. Voeg product toe \n"+
				"2. Toon Producten \n"+
				"3. Toon totaal prijs \n"+
				"4. Toon totaal prijs met kortingen bijgerekend \n"+
				"5. Kijk of de machine een bepaald product bevat \n"+
				"6. Kijk welke soort een bepaald product is \n"+
				"\n 0. Stop \n\n"+
				"Maak uw keuze: ";
	}
	
	private void dispatch(int keuze) throws Exception{
		switch(keuze){
			case 0:
				System.exit(0);
				break;
			case 1:
				addProduct();
				break;
			case 2:
				productToString();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "totaal prijs van producten is " + machine.getTotaalPrijs());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "totaal prijs van producten minus de korting is " + machine.getTotaalPrijsMinKorting());
				break;
			case 5:
				String productID = JOptionPane.showInputDialog("geef product ID");
				UUID productUID = UUID.fromString(productID);
				JOptionPane.showMessageDialog(null, machine.containsProduct(productUID));
				break;
			case 6:
				geefSoortProduct();
				break;
		}
	}

	private void geefSoortProduct() {
		String productID2 = JOptionPane.showInputDialog("geef product ID");
		UUID productUID2 = UUID.fromString(productID2);
		JOptionPane.showMessageDialog(null, "jouw product is een " + machine.getSoortProduct(productUID2));
		
	}

	private void productToString() {
		String overview = "";
		int count = 1;
		for (Product p : machine.getProducten()){
			overview += (count+". " + p.toString() + "\n");
			count++;
		}
		JOptionPane.showMessageDialog(null, overview);
	}

	private void addProduct() throws ParseException {
		String[] choices = {"Non voeding", "non-alcoholische drank", "snack"};
		String soort = (String) JOptionPane.showInputDialog(null, "kies soort product", "Product Soort Keuze", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		String beschrijving = JOptionPane.showInputDialog("geef een product beschrijving");
		String prijs = JOptionPane.showInputDialog("geef de prijs van het product");
		double doublePrijs = Double.parseDouble(prijs);
		Product p;
		if (soort == "Non voeding"){
			String voorMin16 = JOptionPane.showInputDialog("is het product voor -16 jarige? antwoord met true or false");
			boolean boolVoorMin16 = Boolean.parseBoolean(voorMin16);
			p = new NonVoedsel(beschrijving, doublePrijs, boolVoorMin16);
		}else {
			String vervaldatum = JOptionPane.showInputDialog("geef de verval datum in volgende vorm: DD MM YYYY");
			DateFormat df = new SimpleDateFormat("DD MM yyyy");
		    Date dateVervaldatum =  df.parse(vervaldatum);
		    String calories = JOptionPane.showInputDialog("geef het aantal calorieën van het product");
			int intCalories = Integer.parseInt(calories);
			String koeltempratuur = JOptionPane.showInputDialog("geef de koeltempratuur van het product");
			int intKoeltempratuur = Integer.parseInt(koeltempratuur);
			p = new Voeding(beschrijving, doublePrijs, dateVervaldatum, soort, intCalories, intKoeltempratuur);
		}
		machine.addProduct(p);
		
	}
	
	

}
