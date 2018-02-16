package arrayList;

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy( String nm )
	{
		name = nm;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return "\nType of toy: " + name + "\nQuantity: " + count + "\n";
	}
}