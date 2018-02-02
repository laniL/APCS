package arrayList;

import java.util.*;

public class Runner {
	public static void main(String[] args){
	ArrayList<Integer> raylist = new ArrayList<Integer>(); 
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What size would you like the lists? ");
	int x = keyboard.nextInt();
	for (int i=0;i<5; i++) {
		for (int a=0; a<x; a++) {
			raylist.add((int)(Math.random()*20));
		}
		System.out.println(raylist);
		System.out.println("Sum: " + ListTotal.go(raylist));
		System.out.println("Distance between first odd and last even number: " + ListOddToEven.go(raylist));
		System.out.println("Are the numbers decreasing? " + ListDown.go(raylist));
		System.out.println("Are there repeats? " + ListNoRepeats.go(raylist));
		
		System.out.println();
		raylist.clear();
	}
	
	}
}
