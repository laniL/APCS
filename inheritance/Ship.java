package inheritance;

public class Ship {
	private String name;
	private int yearBuilt;
	public Ship(String nm, int year) {
		name=nm;
		yearBuilt=year;
	}
	public void setName(String nm) {
		name=nm;
	}
	public void setYearBuilt(int year) {
		yearBuilt=year;
	}
	public String getName() {
		return name;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public String toString() {
		return "This ship, " + name + ", was built in " + yearBuilt + ".\n";
	}
}
