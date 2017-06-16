
public class methode_mit_parameter
{

public static void main (String [] args)
	{
	long al=1L, bl=200000L;
	int ai=1, bi=99999;
	double dx = 3.14;
    double dy = 999D;
	System.out.println(min(ai, bi));
 	System.out.println(max(al, bl));
	System.out.println(min(dx, dy));
	}

static int min (int i, int j) // call by value
	{
	if (i < j)
		return  i;
	return j;
	}

static double min (double i, double j) // call by value
{
if (i < j)
	return  i;
return j;
}

static long max (long I, long j)
	{
	if (I > j)
		return I;
	return j;
	}

}

