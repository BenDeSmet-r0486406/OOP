package domain;

public class DomainException extends RuntimeException {
	static final long serialVersionUID = 1L;
	public DomainException(String message) {
		super(message);
	    }
		
	    public DomainException(String message, Exception e) {
		super(message, e);
	    }

	

}
