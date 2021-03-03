public class invoice
{
	private String invoiceNo;
	private String cust_id;
	private String date_of_issue;
	private String due_date;
	private String stock_id;
	private String price;
	
	//========= SETTERS =========
	void setInvoiceNo(String invoiceNo)
	{
		this.invoiceNo =invoiceNo;  
	}
	void setCustID(String cust_id)
	{
		this.cust_id =cust_id;  
	}
	void setDateOfIssue(String date_of_issue)
	{
		this.date_of_issue =date_of_issue;  
	}
	void setDueDate(String due_date)
	{
		this.due_date = due_date;  
	}
	void setStockID(String stock_id)
	{
		this.stock_id =stock_id;  
	}
	void setPrice(String price)
	{
		this.price =price;  
	}
	//===========================
	//==========================
	//====== GETTERS =======
	String getInvoiceNo()
	{
		return invoiceNo;
	}
	String getCustomerID()
	{
		return cust_id;
	}
	String getStockID()
	{
		return stock_id;
	}
	String getDateOfIssue()
	{
		return date_of_issue;
	}
	
	String getDueDate()
	{
		return due_date;
	}
	String getPrice()
	{
		return price;
	}
	//=======================
	//=======================
	//=======================
	
	

	public Invoice(String invoice_no, String cust_id, String dateOfIssue, String due_date, String stock_id, String price) throws InvoiceExceptionHandler  {
		id = 0;
		// Validate Input
		try {
			validateName(custName);
			validateAddress(custAddr);
			validatePhoneNumber(custPhone);
		}
		catch (InvoiceExceptionHandler e) {
			throw e;
		}
		// Set Attributes
		 invoiceNo = invoice_no;
	     cust_id = cust_id;
		 date_of_issue = dateOfIssue;
		 due_date = due_date;
		 stock_id = stock_id ;
		 price = price ;
	}
	
	public static boolean isNumeric(String invoice_no) {
	    if (invoice_no == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(invoice_no);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static void validateAddress(String custAddr) throws InvoiceExceptionHandler {
		//Agree Formating Rules on "Customer Address"
		//E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters
		if (custAddr.isBlank() || custAddr.isEmpty())
			throw new InvoiceExceptionHandler("Customer Address NOT specified");
		else if (custAddr.length() < 5)
			throw new InvoiceExceptionHandler("Customer Address does not meet minimum length requirements");
		else if (custAddr.length() > 60)
			throw new InvoiceExceptionHandler("Customer Address does not exceeds maximum length requirements");
	}
	
	public static void validatePhoneNumber(String custPhone) throws InvoiceExceptionHandler {
		
		//Agree Formating Rules on "Customer PhoneNumber"
		//E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters
		
		if (custPhone.isBlank() || custPhone.isEmpty())
			throw new InvoiceExceptionHandler("Customer PhoneNumber NOT specified");
		else if (custPhone.length() < 7)
			throw new InvoiceExceptionHandler("Customer PhoneNumber does not meet minimum length requirements");
		else if (custPhone.length() > 15)
			throw new InvoiceExceptionHandler("Customer PhoneNumber does not exceeds maximum length requirements");
		
	}
	


	
	
	
	
	
	