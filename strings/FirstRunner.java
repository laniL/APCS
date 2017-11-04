package strings;

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println( "word:: " + demo.toString() );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		FirstAndLast demo1 = new FirstAndLast("World");
		System.out.println( "word:: " + demo1.toString() );
		System.out.println( "first letter :: " + demo1.getFirst() );
		System.out.println( "last letter :: " + demo1.getLast() );
		
		FirstAndLast demo4 = new FirstAndLast("JukeBox");
		System.out.println( "word:: " + demo4.toString() );
		System.out.println( "first letter :: " + demo4.getFirst() );
		System.out.println( "last letter :: " + demo4.getLast() );
		
		FirstAndLast demo2 = new FirstAndLast("TCEA");
		System.out.println( "word:: " + demo2.toString() );
		System.out.println( "first letter :: " + demo2.getFirst() );
		System.out.println( "last letter :: " + demo2.getLast() );
		
		FirstAndLast demo3 = new FirstAndLast("UIL");
		System.out.println( "word:: " + demo3.toString() );
		System.out.println( "first letter :: " + demo3.getFirst() );
		System.out.println( "last letter :: " + demo3.getLast() );
		
		
	}
}