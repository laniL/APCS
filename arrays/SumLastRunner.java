package arrays;

public class SumLastRunner {

	public static void main(String[] args) {
		int[] test = new int[10];
		for (int a=0; a<=5; a++) {
			for (int i=0; i<10; i++) {
				test[i] = (int)(Math.random()*20);
				System.out.print(test[i]+" ");
		}
			System.out.println("\t"+RaySumLast.go(test)+"\n");

	}

}
}
