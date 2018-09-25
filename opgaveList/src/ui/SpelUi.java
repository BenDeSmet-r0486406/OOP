package ui;

import javax.swing.JOptionPane;

import db.OpdrachtDatabank;
import domain.Quiz;
import domain.Spel;
import domain.Speler;
import domain.SpelerGroep;

public class SpelUi {
	public void start(){
		SpelerGroep spelers = new SpelerGroep();
		String speler1 = JOptionPane.showInputDialog("Geef de naam van speler 1: ");
		spelers.registreer(speler1);
		String speler2 = JOptionPane.showInputDialog("Geef de naam van speler 2: ");
		spelers.registreer(speler2);
		
		OpdrachtDatabank db = new OpdrachtDatabank("Opdrachten-1.txt"); 
		Quiz quiz = new Quiz(db.getOpdrachten());
		
		Spel spel = new Spel(spelers, quiz);
		while(!spel.isVoorbij()) {
			String vraag = "Vraag voor " + spel.getNaamSpelerAanBeurt() + ":\n\n" + spel.getVolgendeVraag();
			String antwoord = JOptionPane.showInputDialog(vraag);
			spel.speel(antwoord);
		}
		
		Speler winnaar = spel.getWinnaar();
		JOptionPane.showMessageDialog(null, winnaar.getNaam() + " is gewonnen met " + winnaar.getAantalPunten() + " punten!");
	}
}
