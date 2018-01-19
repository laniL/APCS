package arraysAlgorithm;

public class DownRunner {

	public static void main(String[] args) {
		int[] test = new int[3];
		for (int a=0; a<=5; a++) {
			for (int i=0; i<3; i++) {
				test[i] = (int)(Math.random()*20);
				System.out.print(test[i]+" ");
			}
			System.out.println("\t"+RayDown.go(test)+"\n");
		}
	}
}
