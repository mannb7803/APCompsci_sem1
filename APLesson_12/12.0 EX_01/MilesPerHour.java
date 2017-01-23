import java.lang.Math;
public class MilesPerHour
{
	public static int distance, hours, minutes;
	public static double mph = 0;
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
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	public double getMPH()
	{
		mph = Math.round(distance / hours + (minutes / 60));
		return (distance / hours + (minutes / 60));
	}
	public int getDistance()
	{
		return distance;
		//wahooooooooo
	}
	public int getHours()
	{
		return hours;
		//i love getters
	}
	public int getMins()
	{
		return minutes;
	}
	
}