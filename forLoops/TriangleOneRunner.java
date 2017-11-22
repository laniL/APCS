package forLoops;

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne tri = new TriangleOne("hippo");
		tri.print();
		tri.setWord("abcd");
		tri.print();
		tri.setWord("it");
		tri.print();
		tri.setWord("a");
		tri.print();
		tri.setWord("chicken");
		tri.print();
	}
}