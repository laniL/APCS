package arraysAlgorithm;

import java.util.*;

public class MostFreqRunner
{
	public static void main( String args[] )
	{				
		int[] test = new int[10];
		for (int a=0; a<=5; a++) {
			for (int i=0; i<10; i++) {
				test[i] = (int)(Math.random()*20);
				System.out.print(test[i]+" ");
			}
			System.out.println("\t"+RayMostFreq.go(test)+"\n");
		}
	}
}
