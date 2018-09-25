package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

import domain.TweeSteden;

public class Databank {
	private String fileName;

	// TODO Kies een gepaste collectie en initialiseer ze
	private Object afstanden;

	public Databank() {
		this("google_afstanden.txt");
	}

	public Databank(String filename) {
		setFileName(filename);
		loadData();
	}

	private void loadData() {

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(getFileName()));
			while (scanner.hasNextLine()) {
				Scanner lijnScanner = new Scanner(scanner.nextLine());

				// TODO Read the information from a line and add it to your
				// afstanden
				lijnScanner.useDelimiter(";");
				lijnScanner.skip(", Belgium");
				lijnScanner.skip(" km");
				String stadVan = lijnScanner.next();
				String stadNaar = lijnScanner.next();

				double km = lijnScanner.nextDouble();

				this.voegToe(new TweeSteden(stadVan, stadNaar), km);
				lijnScanner.close();
			}
		} catch (FileNotFoundException e) {
			throw new DbException(e.getMessage(), e);
		} finally {
			if(scanner != null){
				scanner.close();
			}
		}
	}

	private void voegToe(TweeSteden afstand, double km) {
		if (afstand == null
		// Add a distance only if no duplicate exists already
		) {
			throw new IllegalArgumentException();
		}
		// Add the distance to afstanden
	}

	private String getFileName() {
		return fileName;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Map<TweeSteden, Double> getAfstanden() {
		// TODO
		return null;
	}
}
