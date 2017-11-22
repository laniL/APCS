package forLoops;

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		System.out.println(word);;
		String seg = "";
		for(int i=1; i<word.length(); i++)
		{
			seg = word.substring(0, word.length()-i);
			System.out.println(seg);
		}
		System.out.println();
	}
}