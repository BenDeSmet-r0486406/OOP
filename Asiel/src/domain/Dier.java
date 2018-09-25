package domain;

import java.time.LocalDate;

public class Dier {
	private LocalDate geboortedatum;
	private String voeding;
	private String lawaai;
	
	public Dier(String voeding, String lawaai) {
		setLawaai(lawaai);
		setVoeding(voeding);
	}
	
	public Dier(LocalDate geboortedatum, String voeding, String lawaai) {
		this(voeding, lawaai);
		this.geboortedatum = geboortedatum;
	}

	public void trektAandacht(){
		
	}

	private LocalDate getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	private String getVoeding() {
		return voeding;
	}

	public void setVoeding(String voeding) {
		this.voeding = voeding;
	}
	
	private void setLawaai(String lawaai) {
		this.lawaai = lawaai;
	}
	
	public String getLawaai(){
		return lawaai;
	}
	
	public String spelen(){
		return "loop";
	}
	
}
