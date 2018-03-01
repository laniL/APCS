package inheritance;

public class Customer extends Person {
	private int customerNumber;
	private boolean mailingList;
	public Customer(String nm, String ad, int tele, int cn, boolean ml) {
		super(nm, ad, tele);
		customerNumber=cn;
		mailingList=ml;
	}
	public void setCustomerNumber(int cn) {
		customerNumber=cn;
	}
	public void setMailingList(boolean ml) {
		mailingList=ml;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public boolean getMailingList() {
		return mailingList;
	}
	public String toString() {
		if (getMailingList())
			return "Name: " + this.getName() + "\nAddress: " + this.getAddress() + "\nTelephone: " + this.getTelephone() + "\nCustomer Number: " + this.getCustomerNumber() + "\nThis person is subscribed to the mailing list.\n";
		else
			return "Name: " + this.getName() + "\nAddress: " + this.getAddress() + "\nTelephone: " + this.getTelephone() + "\nCustomer Number: " + this.getCustomerNumber() + "\nThis person is not subscribed to the mailing list.\n";
	}
	
}
