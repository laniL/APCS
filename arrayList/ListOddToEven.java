package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int evenPosition=-1;
		int oddPosition=-1;
		for (int i=ray.size()-1; i>=0; i--) {
			if (ray.get(i)%2==1)
				oddPosition=i;
		}
		if (oddPosition>=0) {
			for (int i=oddPosition; i<ray.size(); i++) {
				if (ray.get(i)%2==0)
					evenPosition=i;
			}
		}
		if (evenPosition==-1 || oddPosition==-1)
			return -1;
		return evenPosition-oddPosition;
	}
}