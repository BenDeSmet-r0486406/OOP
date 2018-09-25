package domain;

import java.util.ArrayList;

public class Asiel {
	private ArrayList<Dier> dieren = new ArrayList<>();
	
	
	
	public void voegDierToe(Dier dier){
		dieren.add(dier);
	}
	
	public String getLawaai(){
		String lawaai = "";
		
		for (Dier d :dieren){
			lawaai += d.getLawaai() + "\n";
		}
		
		return lawaai;
	}
}
