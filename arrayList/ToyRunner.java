package arrayList;

import static java.lang.System.*;

import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[] args)
	{
		ArrayList<Toy> toys = new ArrayList<Toy>();
		Toy jijoe = new Toy("ji joe");
		jijoe.setCount(5);
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		toys.add(sorry);
		toys.add(jijoe);
		System.out.println(toys);
	}
}