package webapp.exception;

public class JDOMException extends RuntimeException {
	
	public JDOMException() {
		super();
	}
	
	public JDOMException(String message) {
		super(message);
	}
	
	public JDOMException(String message, Throwable e) {
		super(message, e);
	}

}
