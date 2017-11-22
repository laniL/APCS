package whileLoops;

import static java.lang.System.*;

public class DigitAdderRunner
{
	public static void main( String args[] )
	{
		out.println(DigitAdder.sumDigits(234) + " is the sum of the digits of 234");
		out.println(DigitAdder.sumDigits(10000) + " is the sum of the digits of 10000");
		out.println(DigitAdder.sumDigits(111) + " is the sum of the digits of 111");
		out.println(DigitAdder.sumDigits(9005) + " is the sum of the digits of 9005");
		out.println(DigitAdder.sumDigits(84645) + " is the sum of the digits of 84645");
		out.println(DigitAdder.sumDigits(8547) + " is the sum of the digits of 8547");
		out.println(DigitAdder.sumDigits(123456789) + " is the sum of the digits of 123456789");
	}
}