package strings;

import static java.lang.System.*;

public class StringRipper
{
	private String word;

	public StringRipper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
	   word=s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x, y);
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}