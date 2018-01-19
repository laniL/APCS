package arraysAlgorithm;


public class NoRepeatsRunner{
	public static void main(String[] args) {
	int[] test = new int[5];
	for (int a=0; a<=5; a++) {
		for (int i=0; i<5; i++) {
			test[i] = (int)(Math.random()*20);
			System.out.print(test[i]+" ");
			}
		System.out.println("\t"+RayNoRepeats.go(test)+"\n");
		}
	}
}