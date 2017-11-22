package forLoops;

import static java.lang.System.*;

public class BoxWord
{
	private String word;

	public BoxWord(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for (int i=0; i<word.length(); i++)
		{
			System.out.println(word);
		}
		System.out.println("\n");
	}
}