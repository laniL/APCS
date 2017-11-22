package forLoops;

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word back = new Word("Hello");
		System.out.println(back);
		back.setString("World");
		System.out.println(back);
		back.setString("JukeBox");
		System.out.println(back);
		back.setString("TCEA");
		System.out.println(back);
		back.setString("UIL");
		System.out.println(back);
	}
}