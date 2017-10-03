package numCalc;

import java.util.Scanner;

public class WeightedAverage 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test1, test2, quiz1, quiz2, quiz3;
		double hw;
		
		System.out.println("Please enter your test grades");
		System.out.println("Test 1:");
		test1 = scan.nextInt();
		System.out.println("Test 2:");
		test2 = scan.nextInt();
		
		System.out.println("Please enter your quiz grades");
		System.out.println("Quiz 1:");
		quiz1 = scan.nextInt();
		System.out.println("Quiz 2:");
		quiz2 = scan.nextInt();
		System.out.println("Quiz 3");
		quiz3 = scan.nextInt();
		
		System.out.println("Please enter your homework average");
		System.out.println("Homework:");
		hw = scan.nextInt();
		
		double testAvg = (test1+test2)/2.0;
		double quizAvg = (quiz1+quiz2+quiz3)/3.0;
		
		System.out.println("Test Average: " + testAvg);
		System.out.println("Quiz Average: " + quizAvg);
		System.out.println("Homework: " + hw);
		System.out.println("Final Grade: " + (testAvg*.5+quizAvg*.3+hw*.2));
		
		
		
	}
	
	
}

