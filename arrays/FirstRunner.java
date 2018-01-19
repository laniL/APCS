package arrays;

public class FirstRunner
{
	public static void main( String args[] )
	{
		int[] test = new int[20];
		for (int a=0; a<=5; a++) {
			for (int i=0; i<(int)(Math.random()*20); i++) {
				test[i] = (int)(Math.random()*20);
				System.out.print(test[i]+" ");
		}
			System.out.println(RayFirst.go(test)+"\n");
		}	
		
	}
}