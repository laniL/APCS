package whileLoops;

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		PerfectNumber check = new PerfectNumber(496);
		System.out.println(check);
		check.setNum(46);
		System.out.println(check);
		check.setNum(6);
		System.out.println(check);
		check.setNum(14);
		System.out.println(check);
		check.setNum(8128);
		System.out.println(check);
		check.setNum(1245);
		System.out.println(check);
		check.setNum(33);
		System.out.println(check);
		check.setNum(28);
		System.out.println(check);
		check.setNum(27);
		System.out.println(check);
		check.setNum(33550336);
		System.out.println(check);
	}
}