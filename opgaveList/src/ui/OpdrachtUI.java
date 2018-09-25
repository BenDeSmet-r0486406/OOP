package ui;

import javax.swing.JOptionPane;

import domain.Opdracht;

public class OpdrachtUI {

	public static void main(String[] args) {
		// We maken 1 opdracht
		int id = 1;
		String auteur = "Leentje";
		String categorie = Opdracht.CATEGORIE_AARDRIJKSKUNDE;
		String vraag = "Wat is de hoofdstad van Belgie?";
		String antwoordhint = "Je vindt er het atomium";
		String antwoord = "Brussel";
		boolean isHoofdlettergevoelig = true;
		Opdracht opdracht1 = new Opdracht(id, vraag, antwoord,
				isHoofdlettergevoelig, antwoordhint, categorie, auteur);
		JOptionPane.showMessageDialog(null, opdracht1);

		// TODO maak een nieuwe klasse die de logica om opdrachten van een CSV
		// bestand te lezen, implementeert, en hier een Quiz van
		// maakt
		
		// TODO schrijf de main methode verder uit zodat dit ook gebeurt

	}

}
