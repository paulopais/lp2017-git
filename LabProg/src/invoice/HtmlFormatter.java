package invoice;

public class HtmlFormatter implements InvoiceFormatter{

	@Override
	public String formatHeader() {
		
		return "INVOICE<br>";
	}

	@Override
	public String formatLineItem(LineItem item) {
		
		return null;
	}

	@Override
	public String formatFooter() {
		// TODO Auto-generated method stub
		return null;
	}

}
