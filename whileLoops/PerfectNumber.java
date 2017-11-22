package whileLoops;

import static java.lang.System.*;

import static java.lang.System.*;

public class PerfectNumber
{
   private int number;

	public PerfectNumber (int num)
	{
		setNum(num);
	}
	
	public void setNum(int num)
	{
		number = num;
	}

	public boolean isPerfect()
	{
		int div=1;
		double ddiv=1.0;
		int count=0;
		while (div<number)
		{
			if (number/div==(double)number/ddiv)
				count+=div;
			ddiv++;
			div++;
		}
		return number==count;
	}
	
	public String toString()
	{
		if (isPerfect()==true)
			return number + " is perfect";
		else return number + " is not perfect";
	}
	
}