import java.lang.Math;
public class distance
{
	public static int xOne, xTwo, yOne, yTwo;
	public static double distance;
	public distance()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	public distance(int x1, int x2, int y1, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	public void setValues(int x1, int x2, int y1, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	public static double getDist()
	{
		distance = Math.sqrt((xTwo-xOne) * (xTwo-xOne) + (yTwo-yOne) * (yTwo-yOne));
		return distance;
	}
}