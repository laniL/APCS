package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total=0;
		for (int i=0; i<ray.size(); i++) {
			total+=ray.get(i);
		}
		return total;
	}
}