package numCalc;

import java.util.Scanner;

public class ChangeMachine 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cost of Item: ");
		double cost = scan.nextDouble();
		System.out.println("Amount Paid: ");
		double paid = scan.nextDouble();
		double change = paid-cost+.0001;
		System.out.println("Change Owed: " + change);
		int dollars = (int)change;
		change = (change-dollars)*100;
		int quarters = (int)change/25;
		change = change%25;
		int dimes = (int)change/10;
		change = change%10;
		int nickels = (int)change/5;
		int pennies = (int)change%5;
		System.out.println("Dollars: " + dollars);				
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
	}
}
