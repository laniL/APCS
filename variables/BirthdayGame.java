package variables;

import java.util.Scanner;

public class BirthdayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Using pen and paper, perform the following calculations:");
		System.out.println("Take your birth month (January = 1, February = 2, etc) and multiply it by 5");
		System.out.println("Add 6 to that number");
		System.out.println("Multiply that number by 4");
		System.out.println("Add 9 to that number");
		System.out.println("Multiply that number by 5");
		System.out.println("Add your birth day to the number");
		System.out.println("What is your number?");
		int num = scan.nextInt();
		
		num-=165;
		int month=num/100;
		int day=num%100;
		
		System.out.println("Your birthday is " + month + "/" + day + ".");
		
		
	}

}
