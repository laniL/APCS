package arraysAlgorithm;

public class RayNoRepeats {
		//method go will return true if there
		//are no numbers that repeat
		//false if any numbers repeat
		public static boolean go(int[] ray)
		{		
			for(int i=0; i<ray.length; i++) {
				int value=ray[i];
				for (int a=0; a<ray.length && a!=i; a++) {
					if (ray[a]==value)
						return false;
				}
				
			}
			return true;
		}
}
