package whileLoops;

import static java.lang.System.*;

public class DigitCounter
{
	private int number;
	
	public DigitCounter(int num)
	{
		setNum(num);
	}
	
	public void setNum(int num)
	{
		number = num;
	}
	
   public int countDigits()
	{
		int sum=0;
		while (number>0)
		{
			number = number/10;
			sum++;
		}
		return sum;
	}
   
   public String toString()
   {
	   return number + " contains " + countDigits() + " digits";
   }
}
