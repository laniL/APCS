package whileLoops;

import static java.lang.System.*;

public class DigitCounterRunner
{
	public static void main( String args[] )
	{
		DigitCounter count = new DigitCounter(234);
		System.out.println(count);
		count.setNum(10000);
		System.out.println(count);
		count.setNum(111);
		System.out.println(count);
		count.setNum(9005);
		System.out.println(count);
		count.setNum(84645);
		System.out.println(count);
		count.setNum(8547);
		System.out.println(count);
		count.setNum(123456789);
		System.out.println(count);
	}

}