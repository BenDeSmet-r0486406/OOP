package domain;

import java.util.Date;

public class Voeding extends Product {
	private int calories;
	private int koeltempratuur;
	private String soort;
	
	public Voeding(String beschrijving, double prijs, Date vervaldatum, String soort, int calories, int koeltempratuur) {
		super(beschrijving, prijs, vervaldatum);
		if (soort == "snack"){
			super.setKorting(25);
			
		} else if(soort== "non-alcoholische drank"){
			super.setKorting(50);
		}
		this.setCalories(calories);
		this.setSoort(soort);
		this.setKoeltempratuur(koeltempratuur);
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getKoeltempratuur() {
		return koeltempratuur;
	}

	public void setKoeltempratuur(int koeltempratuur) {
		this.koeltempratuur = koeltempratuur;
	}

	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		if (soort != "non-alcoholische drank" && soort != "snack"){
			throw new DomainException("soort moet 'non-alcoholische drank' of 'snack' zijn");
		}else {
			this.soort = soort;
		}
	}
	
	

}
