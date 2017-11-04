package ifElseStrings;

import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Grade grader = new Grade(78);
		System.out.println(grader);
		
		grader.setGrade(92);
		System.out.println(grader);
		
		grader.setGrade(31);
		System.out.println(grader);
		
		grader.setGrade(82);
		System.out.println(grader);
		
		grader.setGrade(77);
		System.out.println(grader);
		
		grader.setGrade(73);
		System.out.println(grader);
		
		grader.setGrade(55);
		System.out.println(grader);
		
		grader.setGrade(65);
		System.out.println(grader);
		
	}
}