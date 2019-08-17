package inheritance;

public class Circle extends Shape
{
	int radius;

	public Circle(int radius) 
	{
		super("circle");
		this.radius = radius;
	}
	
	public int getRadius() 
	{
		return radius;
	}
	public void setRadius(int radius) 
	{
		this.radius = radius;
	}

	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
}
