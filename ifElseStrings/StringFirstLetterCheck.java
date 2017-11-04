package ifElseStrings;

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo= two;
	}

	public boolean checkFirstLetter( )
	{
		if (wordOne.charAt(0)==wordTwo.charAt(0))
		return true;
		else return false;
	}

	public String toString()
	{
		if (checkFirstLetter())
			return wordOne + " has the same first letter as " + wordTwo + "\n";
		else return wordOne + " does not have the same first letter as " + wordTwo + "\n";
	}
}