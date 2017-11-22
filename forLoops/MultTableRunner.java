package forLoops;

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable mt = new MultTable(5,5);
		mt.printTable();
		mt.setTable(3, 7);
		mt.printTable();
		mt.setTable(1, 6);
		mt.printTable();
		mt.setTable(9, 9);
		mt.printTable();
		mt.setTable(7, 8);
		mt.printTable();
	}
}