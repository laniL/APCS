package arraysAlgorithm;

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	
	public static int go(int[] ray)
	{
		/*int[] count = new int[ray.length];
		for (int i=0; i<ray.length; i++) {
			for (int a=0; a<ray.length; a++) {
				if (ray[a]==ray[i])
			}
		}
		*/
		int most=ray[0];
		int count=0;
		int maxcount=0;
		for (int i=0; i<ray.length; i++) {
			int value=ray[i];
			for(int a=0; a<ray.length; a++) {
				if(ray[a]==value)
					count++;
			}
			if (count>maxcount) {
				maxcount=count;
				most=value;
		}
			count=0;
		}
		
		
		return most;
	}
}