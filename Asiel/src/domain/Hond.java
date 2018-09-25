package domain;

public class Hond extends Dier{
	private int aantalUit;
	
	
	public Hond(int aantalUit, String voeding){
		super(voeding, "woef");
		setAantalUit(aantalUit);
		
	}

	private void setAantalUit(int aantalUit) {
		this.aantalUit = aantalUit;
	}

	@Override
	public String spelen(){
		return "staart";
	}
	
}
