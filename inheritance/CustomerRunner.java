package inheritance;

import java.util.*;

public class CustomerRunner {
	public static void main(String[] args) {
		Customer me = new Customer("Smith", "123 Maple St", 1234567890, 01, true);
		System.out.println(me);
		Scanner scan = new Scanner(System.in);
		System.out.println("Is your name " + me.getName() + "?");
		if (scan.nextLine().equals("no")) {
			System.out.println("Okay, what is your name?");
			me.setName(scan.nextLine());
		}
		System.out.println("Do you live at " + me.getAddress() + "?");
		if (scan.nextLine().equals("no")) {
			System.out.println("Okay, where do you live?");
			me.setAddress(scan.nextLine());
		}
		System.out.println("Is your telephone number " + me.getTelephone() + "?");
		if (scan.nextLine().equals("no")) {
			System.out.println("Okay, what is your telephone number?");
			me.setTelephone(scan.nextInt());
		}
		if (me.getMailingList()) {
			System.out.println("Your customer number is " + me.getCustomerNumber() + ". You are currently subscribed to our mailing list. Would you like to unsubscribe?");
			if (scan.nextLine().equals("yes")) {
				me.setMailingList(false);
				System.out.println("You have been removed from our mailing list. Have a nice day!");
			}
			else 
				System.out.println("Okay, have a nice day!");
		}
		else {
			System.out.println("Your customer number is " + me.getCustomerNumber() + ". You are currently not subscribed to our mailing list. Would you like to subscribe?");
			if (scan.nextLine().equals("yes")) {
				me.setMailingList(true);
				System.out.println("You have been added to our mailing list. Have a nice day!");
			}
			else 
				System.out.println("Okay, have a nice day!");
		}
	}

}
