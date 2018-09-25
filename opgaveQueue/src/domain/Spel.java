package domain;

public class Spel {

	/**
	 * Maakt een nieuw spel aan met de gegeven spelergroep en quiz.
	 * 
	 * @param spelers	de groep van spelers
	 * @param quiz	de quiz
	 */	
	public Spel(SpelerGroep spelers, Quiz quiz) {
	}

	/**
	 * Geeft aan of er nog opdrachten zijn in de quiz.
	 * 
	 * @return true als er geen opdrachten meer over zijn in de quiz, anders false
	 */
	public boolean isVoorbij() {
		return false;
	}

	/**
	 * Geeft de vraag van de volgende opdracht van de quiz.
	 * 
	 * @return de vraag van de volgende opdracht van de quiz
	 */
	public String getVolgendeVraag() {
		return null;
	}

	/**
	 * Controleert of het antwoord juist is, kent punten toe en zet de volgende speler aan beurt. 
	 * Indien het antwoord juist is, krijgt de speler die aan beurt was 10 punten bij. Infien fout worden er geen punten toegekend.
	 * 
	 * @param antwoord	het antwoord van de speler op de vraag
	 */
	public void speel(String antwoord) {
	}

	/**
	 * Geeft de speler terug met het meeste punten.
	 * 
	 * @return de speler met het meeste punten
	 */
	public Speler getWinnaar() {
		return null;
	}

	/**
	 * Geeft de naam van de speler terug die nu aan beurt is. 
	 * 
	 * @return de naam van de speler die nu aan beurt is
	 */
	public String getNaamSpelerAanBeurt() {
		return null;
	}
	
}
