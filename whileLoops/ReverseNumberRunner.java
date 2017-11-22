package whileLoops;

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		ReverseNumber reverse = new ReverseNumber(234);
		System.out.println(reverse);
		reverse.setNum(10000);
		System.out.println(reverse);
		reverse.setNum(111);
		System.out.println(reverse);
		reverse.setNum(9005);
		System.out.println(reverse);
		reverse.setNum(84645);
		System.out.println(reverse);
		reverse.setNum(8547);
		System.out.println(reverse);
		reverse.setNum(123456789);
		System.out.println(reverse);
	}
}