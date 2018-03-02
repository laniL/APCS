package inheritance;

public class PreferredCustomer extends Customer {
	private int purchases;
	private int discount;
	public PreferredCustomer(String nm, String ad, int tele, int cn, boolean ml, int p) {
		super(nm, ad, tele, cn, ml);
		purchases=p;
		setDiscount(p);
	}
	public void setPurchases(int p) {
		purchases=p;
		setDiscount(p);
	}
	public int getPurchases() {
		return purchases;
	}
	public int getDiscount() {
		return discount;
	}
	private void setDiscount(int p) {
		if (purchases>=2000)
			discount=10;
		else if (purchases>=1500)
			discount=7;
		else if (purchases>=1000)
			discount=6;
		else if (purchases>=500)
			discount=5;
	}
}
