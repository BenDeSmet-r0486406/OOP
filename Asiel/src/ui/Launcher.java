package ui;

import domain.Asiel;
import domain.Dier;
import domain.Giraf;
import domain.Hond;
import domain.Kat;

public class Launcher {

	public static void main(String[] args) {
		Dier hond = new Hond(2, "Biefstuk");
		Dier giraf = new Giraf("bier");
		Dier kat = new Kat("vis");
		
		System.out.println(hond.spelen());
		
		Asiel asiel = new Asiel();
		asiel.voegDierToe(hond);
		asiel.voegDierToe(giraf);
		asiel.voegDierToe(kat);
		
		System.out.println(asiel.getLawaai());
	}

}
