package forLoops;

import static java.lang.System.*;

public class BoxRunner
{
	public static void main ( String[] args )
	{
		BoxWord box = new BoxWord("hippo")	;
		box.print();
		box.setWord("abcd");
		box.print();
		box.setWord("it");
		box.print();
		box.setWord("a");
		box.print();
		box.setWord("chicken");
		box.print();
	}
}