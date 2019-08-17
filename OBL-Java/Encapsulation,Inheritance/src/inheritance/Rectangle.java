package inheritance;

public class Rectangle extends Shape
{
    int length;
    int breadth;
    
	public Rectangle(int length, int breadth) 
	{
		super("rectangle");
		this.length = length;
		this.breadth = breadth;
	}
    
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}

	public int getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(int breadth) 
	{
		this.breadth = breadth;
	}

	public double calculateArea()
	{
		return length*breadth;
	}
}
