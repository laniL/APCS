package inheritance;

public class CargoShip extends Ship{
	private int tonnage;
	public CargoShip(String nm, int year, int ton) {
		super(nm, year);
		tonnage=ton;
	}
	public void setTonnage(int ton) {
		tonnage=ton;
	}
	public int getTonnage() {
		return tonnage;
	}
	public String toString() {
		return "This ship, " + this.getName() + ", was built in " + this.getYearBuilt() + " and can hold " + tonnage + " tons of cargo.\n";
	}
}
