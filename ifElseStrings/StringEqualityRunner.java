package ifElseStrings;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality checker = new StringEquality("hello", "goodbye");
		System.out.println(checker);
		
		checker.setWords("one", "two");
		System.out.println(checker);
		
		checker.setWords("three", "four");
		System.out.println(checker);
		
		checker.setWords("TCEA", "UIL");
		System.out.println(checker);
		
		checker.setWords("State", "Champions");
		System.out.println(checker);
		
		checker.setWords("ABC", "ABC");
		System.out.println(checker);
		
		checker.setWords("ABC", "CBA");
		System.out.println(checker);
		
		checker.setWords("Same", "Same");
		System.out.println(checker);
	}
}