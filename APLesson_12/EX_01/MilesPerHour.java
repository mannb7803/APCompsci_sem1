import java.lang.Math;
public class MilesPerHour
{
	public static int distance, hours, minutes;
	public static double mph;
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MilesPerHour(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	public void setMPH(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
}