package domain;

import java.util.ArrayList;

public class Quiz {
	
	// TODO Vervang door een een gepaste collectie en initialiseer ze
	private ArrayList<Opdracht> opdrachten;
		
	public Quiz(){		
	}
	
	public Quiz(ArrayList<Opdracht> opdrachten){// TODO Vervang parameter door een een gepaste collectie
		this.opdrachten = opdrachten;
	}
		
		// hoeveel opdracht objecten zitten er in de opdrachtenCollectie
	public int getAantalOpdrachten(){
		return opdrachten.size();
	}
		
	public boolean isLeeg(){
		// TODO
		return opdrachten.isEmpty();
	}
		
	//return opdrachtobject op plaats index in de opdrachtenCollectie
	public Opdracht getOpdracht(int index) {
		// TODO
		return opdrachten.get(index);
	}
		
	// zet op de plaats index in de opdrachteRij het opdrachtobject opdrachtNieuw
	// en returned de eventuele opdracht die op plaats index in de opdrachtenCollectie al aanwezig is
	public Opdracht setOpdracht(int index,Opdracht opdrachtNieuw) {
		if(opdrachten.get(index) != null){
			Opdracht temp = opdrachten.get(index);
			opdrachten.set(index, opdrachtNieuw);
			return temp;
		} else{
			opdrachten.set(index, opdrachtNieuw);
			return null;
		}
	}
		
	//voegt een nieuwe opdracht toe achteraan de opdrachtenCollectie
	
	public boolean voegOpdrachtToe(Opdracht opdrachtNieuw){
		return opdrachten.add(opdrachtNieuw);
	}
		
	// TODO voegt een nieuwe opdracht toe op de plaats index in de opdrachtenCollectie
	public boolean voegOpdrachtToe(int index,Opdracht opdrachtNieuw) {
		opdrachten.add(index,opdrachtNieuw);
		return true;
	}
		
	// TODO verwijder de eventuele opdracht op plaats index in de opdrachtenCollectie
	//geeft de verwijderde opdracht terug
	public Opdracht verwijderOpdracht(int index) {
		return opdrachten.remove(index);
	}	
		
	// TODO elke opdracht uit de opdrachtenCollectie(volgens toString van Opdracht klasse), elke
	//opdracht op een nieuwe lijn
	@Override
	public String toString(){
		String result = "";
		for (Opdracht o : opdrachten){
			result += o.toString() + "\n";
		}
		return result;
	}
}
