package inheritance;

public class CruiseShip extends Ship {
	private int passengers;
	public CruiseShip(String nm, int year, int pass) {
		super(nm, year);
		passengers=pass;
	}
	public void setPassengers(int pass) {
		passengers=pass;
	}
	public int getPassengers() {
		return passengers;
	}
	public String toString() {
		return "This ship, " + this.getName() + ", was built in " + this.getYearBuilt() + " and can hold " + passengers + " passengers.\n";
	}
}
