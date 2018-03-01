package inheritance;

public class Person {
	private String name;
	private String address;
	private int telephone;
	public Person(String nm, String ad, int tele) {
		name=nm;
		address=ad;
		telephone=tele;
	}
	public void setName(String nm) {
		name=nm;
	}
	public void setAddress(String ad) {
		address=ad;
	}
	public void setTelephone(int tele) {
		telephone=tele;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getTelephone() {
		return telephone;
	}
	public String toString() {
		return "Name: " + name + "\nAddress: " + address + "\nTelephone: " + telephone + "\n";
	}
}
