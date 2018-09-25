package domain;

import java.util.Calendar;
import java.util.Date;

public class NonVoedsel extends Product {
	private boolean voorMin16;
	
	public NonVoedsel(String beschrijving, double prijs, boolean voorMin16) {
		super(beschrijving, prijs, 0);
		this.setVoorMin16(voorMin16);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 2);
		Date today = cal.getTime();
		super.setVervaldatum(today);
	}

	public boolean isVoorMin16() {
		return voorMin16;
	}

	public void setVoorMin16(boolean voorMin16) {
		this.voorMin16 = voorMin16;
	}

}
