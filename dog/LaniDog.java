package dog;

public class LaniDog implements Dog {
	private String ownersName, dogsName, dogsBark;
	public LaniDog (String owner, String dog, String bark) {
		ownersName = owner;
		dogsName = dog;
		dogsBark = bark;
	}
	public String getOwnerName() {
		return ownersName;
	}
	public String getDogName() {
		return dogsName;
	}
	public String getBark() {
		return dogsBark;
	}
	public String toString() {
		return ownersName + "'s dog " + dogsName + " says " + dogsBark;
	}
}
