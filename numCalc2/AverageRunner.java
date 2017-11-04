package numCalc2;

public class AverageRunner
{
	public static void main( String[] args )
   {
		NumAvg ave = new NumAvg();
 		ave.setNums(5,5);
 		ave.average();
 		ave.print();
 		
 		ave.setNums(90,100);
 		ave.average();
 		ave.print();
 		
 		ave.setNums(100,85.8);
 		ave.average();
 		ave.print();
 		
 		ave.setNums(-100,55);
 		ave.average();
 		ave.print();
 		
 		ave.setNums(15236,5642);
 		ave.average();
 		ave.print();
 		
 		ave.setNums(1000,555);
 		ave.average();
 		ave.print();
	}
}