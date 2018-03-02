package inheritance;

public class ShipRunner {
	public static void main(String[] args) {
		Ship boat = new Ship("Old Al", 1990);
		System.out.println(boat);
		
		CruiseShip cruise = new CruiseShip("Sailor", 2000, 3000);
		System.out.println(cruise);
		
		CargoShip cargo = new CargoShip("Larry", 2005, 1000);
		System.out.println(cargo);
		
	}

}
