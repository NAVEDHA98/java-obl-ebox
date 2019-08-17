package inheritance;

public class Square extends Shape
{
	int side;

	public Square(int side) 
	{
		super("square");
		this.side = side;
	}
	
	public int getSide() 
	{
		return side;
	}
	public void setSide(int side) 
	{
		this.side = side;
	}

	public double calculateArea()
	{
		return side*side;
	}
}
