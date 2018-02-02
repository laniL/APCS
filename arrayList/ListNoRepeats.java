package arrayList;

import java.util.List;

public class ListNoRepeats
{
	public static boolean go(List<Integer> ray)
	{
		int count=0;
		for (int i=0; i<ray.size(); i++) {
			for (int j=0; j<ray.size(); j++) {
				if (ray.get(i)==ray.get(j))
					count++;
			}
			if (count>1)
				return true;
			count=0;
		}
		return false;
	}
}