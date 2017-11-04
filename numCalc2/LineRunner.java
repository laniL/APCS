package numCalc2;

public class LineRunner
{
	public static void main( String[] args )
   {
		Line segment = new Line(1, 9, 14, 2);
		segment.calculateSlope();
		segment.print();
		
		Line segment1 = new Line(1, 7, 18, 3);
		segment1.calculateSlope();
		segment1.print();
		
		Line segment2 = new Line(6, 4, 2, 2);
		segment2.calculateSlope();
		segment2.print();
		
		Line segment3 = new Line(4, 4, 5, 3);
		segment3.calculateSlope();
		segment3.print();
		
		Line segment4 = new Line(1, 1, 2, 9);
		segment4.calculateSlope();
		segment4.print();
	}
}