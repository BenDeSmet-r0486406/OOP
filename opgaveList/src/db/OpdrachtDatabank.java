package db;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Opdracht;

public class OpdrachtDatabank {
	private ArrayList<Opdracht> opdrachten = new ArrayList<Opdracht>();
	private File file;
	
	public OpdrachtDatabank (String filename){
		try{
			this.file = new File(filename);
			this.setOpdrachten();
		}catch(Exception e){
			throw new IllegalArgumentException("bestand niet gevonden");
		}
	}
	
	public  void setOpdrachten (){
		opdrachten.clear();
		try{
			Scanner scannerFile = new Scanner(file);
			while (scannerFile.hasNextLine()){
				Scanner scannerLine = new Scanner(scannerFile.nextLine());
				scannerLine.useDelimiter("\t");
				String id = scannerLine.next();
				String vraag = scannerLine.next();
				String antwoord = scannerLine.next();
				String hlg = scannerLine.next();
				String hint = scannerLine.next();
				String categorie = scannerLine.next();
				String auteur = scannerLine.next();
				int idInt = Integer.parseInt(id);
				boolean hlgBool = Boolean.parseBoolean(hlg);
				Opdracht opdracht = new Opdracht(idInt,vraag,antwoord,hlgBool,hint,categorie,auteur);
				opdrachten.add(opdracht);
			}
		}catch(Exception e){
			throw new DbException("db problemen " +e.getMessage());
		}
	}
	
	public ArrayList<Opdracht> getOpdrachten(){
		return opdrachten;
	}
	
	public void voegToe(Opdracht o){
		for (Opdracht opdracht: opdrachten){
			if(opdracht.equals(o) || o == null){
				throw new IllegalArgumentException("opdracht zit al in db");
			}
		}
		opdrachten.add(o);
			try{
				PrintWriter writer = new PrintWriter(new FileWriter(file,true));
				writer.print(o.getOpdrachtID()+"\t"+o.getVraag()+"\t"+o.getAntwoord()+"\t"+o.isHoofdletterGevoelig()+"\t"+o.getAntwoordHint()+"\t"+o.getCategorie()+"\t"+o.getAuteur() );
				writer.close();
			}catch(Exception e){
				throw new DbException("db problemen " + e.getMessage());
			}
		
	}

}
