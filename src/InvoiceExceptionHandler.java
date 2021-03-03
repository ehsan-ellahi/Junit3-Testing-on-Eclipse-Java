public class InvoiceExceptionHandler extends Exception {
	String message;
	
	public InvoiceExceptionHandler(String errMessage) {
		message = errMessage;
	}
	
	public String getMessage() {
		return message;
	}
}
