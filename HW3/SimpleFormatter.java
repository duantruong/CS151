package Invoice;

/**
A simple invoice formatter.
 */
public class SimpleFormatter implements InvoiceFormatter
{
	Invoice invoice=new Invoice();
	public String formatHeader()
	{
		total = 0;
		return "     I N V O I C E\n\n\n";
	}

	public String formatLineItem(LineItem item)
	{
		total += item.getPrice();
		return (String.format(
				"%s: x"+Invoice.getQuantity()+"$%.2f\n",item.toString(),total));
	}

	public String formatFooter()
	{
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}

	private double total;
}
