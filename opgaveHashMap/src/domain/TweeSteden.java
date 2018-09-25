package domain;


public class TweeSteden {

	private String van, naar;

	/**
	 * Inhoud van 2 TweeSteden objecten zijn gelijk:
	 * 	de steden van en naar mogen gewisseld zijn in het andere object
	 *  of op een andere manier met hoofdletters geschreven zijn.
	 */
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof TweeSteden){
			/*String thisVan = this.van.toLowerCase();
			String thisNaar = this.van.toLowerCase();
			String thatVan = ((TweeSteden) o).getVan().toLowerCase();
			String thatNaar = ((TweeSteden) o).getNaar().toLowerCase();
			if(thisVan.equals(thatNaar) && thisNaar.equals(thatVan)){
				result = true;
			}else if(thisVan.equals(thatVan) && thisNaar.equals(thatNaar)){
				result = true;
			*/
			if(this.hashCode()==o.hashCode()){
				result = true;
			}
		}
		return result;
	}

	public String toString(){
		return "Van " + this.getVan() + " naar " + this.getNaar() ;
	}
	
	public int hashCode(){
		return van.toLowerCase().hashCode() + naar.toLowerCase().hashCode() ;
	}

	public TweeSteden(String van, String naar){
		this.setVan(van);
		this.setNaar(naar);
	}
	public String getVan() {
		return van;
	}
	private void setVan(String van) throws IllegalArgumentException{
		if (van == null){
			throw new IllegalArgumentException();
		}
		
		this.van = van;
	}
	public String getNaar() {
		return naar;
	}
	private void setNaar(String naar) throws IllegalArgumentException{
		if (naar == null){
			throw new IllegalArgumentException();
		}
		
		this.naar = naar;
	}
	
}
