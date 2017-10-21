package numCalc2;

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = 2*width+2*length;
	}

	public void print( )
	{
		System.out.println("Perimeter : " + perimeter);
	}
}