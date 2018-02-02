package arrayList;

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	public static boolean go(List<Integer> numArray)
	{
		for (int i=1; i<numArray.size(); i++) {
			if (numArray.get(i-1)<=numArray.get(i))
				return false;
		}
		return true;
	}	
}