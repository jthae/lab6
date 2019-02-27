/*
 * Lab 6
 * 
 * @author Jaycie Thaemert
 * 
 * Class representing a rectangle.
 * 
 */

public class Rectangle extends Polygon 
{
	
	private double height;
	
	private double width;
	
	public Rectangle (String id, double height, double width)
	{
		super(id);
		
		this.height = height;
		this.width = width;
		
		sideLengths.add(height);
		sideLengths.add(width);
		sideLengths.add(height);
		sideLengths.add(width);
	}
	
	@Override
	public double getArea() 
	{
		double area = height * width;
		return area;
	}
	
	@Override
	public String getShapeType()
	{
		return "Rectangle";
	}

}
