//As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal. - Using Java equals method
import java.lang.*;

public class LineComparison {

    public static void main(String[] args) {
	
	
		LineComparison line = new LineComparison();
    
       
        double length1 = line.length(3.0,5.0,4.0,6.0);
        String lineOne = Double.toString(length1);

        double length2 = line.length(3.0,2.0,4.0,6.0);
        String lineTwo = Double.toString(length2);



        if (lineOne.equals(lineTwo)) 
		{
            System.out.println("Lines are equal");
        } 
		else if (Double.compare(length1,length2) > 0) 
		{
            System.out.println("Line 1 is greater than Line 2");
        } 
		else if (Double.compare(length1,length2) < 0) 
		{
            System.out.println("Line 2 is greater than Line 1");
        }
    }
	double length(double x1, double y1, double x2, double y2) 
	{

        double result = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        return result;
    }

}