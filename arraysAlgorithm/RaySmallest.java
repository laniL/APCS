package arraysAlgorithm;

public class RaySmallest {
	public static int go(int[] ray)
	{
		int smallest=ray[0];
		for (int i=1; i<ray.length; i++) {
			if (ray[i]<smallest)
				smallest=ray[i];
		}
		return smallest;
	}
}
