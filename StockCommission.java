package numCalc;

import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Number of shares: ");
		double shares = keyboard.nextDouble();
		System.out.println("Price per share: ");
		double price = keyboard.nextDouble();
		System.out.println("Percent commission: ");
		double commission = keyboard.nextDouble();
		
		double total = price*shares;
		commission = (commission/100)*total;
		
		
		System.out.println("Price of stocks: $" + ((Math.round(total*100))/100.0));
		System.out.println("Total commission: $" + Math.round(commission*100)/100.0);
		System.out.println("Total amount paid: $" + Math.round((commission+total)*100)/100.0);
		

	}

}
