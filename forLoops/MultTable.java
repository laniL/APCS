package forLoops;

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int num, int end)
	{
		setTable(num,end);
	}

	public void setTable(int num, int end)
	{
		number=num;
		stop=end;
	}

	public void printTable( )
	{
		for (int i=1; i<=stop; i++)
		{
			System.out.println(number + "\t" + number*i);
		}
		System.out.println();
	}
}