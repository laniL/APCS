package ifElseStrings;

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		StringFirstLetterCheck checker = new StringFirstLetterCheck("hello", "howdy");
		System.out.println(checker);
		
		checker.setWords("one", "two");
		System.out.println(checker);
		
		checker.setWords("three", "two");
		System.out.println(checker);
		
		checker.setWords("TCEA", "UIL");
		System.out.println(checker);
		
		checker.setWords("State", "Champions");
		System.out.println(checker);
		
		checker.setWords("ABC", "DEF");
		System.out.println(checker);
	}
}