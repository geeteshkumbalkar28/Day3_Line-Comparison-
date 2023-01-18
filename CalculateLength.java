//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length
import java.lang.*;

public class CalculateLength
{
	public static void main(String arg[])
	{
		Length obj =new Length();
		double iAns=obj.length(5.0,4.0,6.0,3.0);
		System.out.println("length is: "+iAns);
	}
    double length(double x1, double y1, double x2, double y2) {

        double result = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        return result;
    }
}