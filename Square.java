/*
 * Lab 6
 * 
 * Class representing a square
 * 
 * @author Jaycie Thaemert
 * 
 */
public class Square extends Rectangle 
{
	
	/*
	 * Square constructor.
	 * 
	 * @param id, representing name of shape
	 * @param size, representing side length
	 */
	public Square(String id, double size)
	{
		super(id, size, size);
	}
	
	public String getShapeType()
	{
		return "Square";
	}
}
