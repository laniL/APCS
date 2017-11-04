package ifElseStrings;

import static java.lang.System.*; 

public class Grade
{
	private int numGrade;

	public Grade(int grade)
	{
		setGrade(grade);
	}

	public void setGrade(int grade)
	{
		numGrade=grade;
	}

	public String getLetterGrade( )
	{
		if (numGrade >= 90)
			return "A";
		else if (numGrade >= 80)
			return "B";
		else if (numGrade >=75)
			return "C";
		else if (numGrade >=70)
			return "D";
		else return "F";
	}

	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}