package inheritance;

import java.util.Scanner;

public class AreaOfShape 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Rectangle");
		System.out.println("2.Square");
		System.out.println("3.Circle");
		
		System.out.println("Area Calculator --- Chhose your shape");
		int shape = sc.nextInt();
		
		if(shape == 1)
		{
		    System.out.println("Enter length and breadth:");
		    int length = sc.nextInt();
		    int breadth = sc.nextInt();
		    
		    Rectangle rectangle = new Rectangle(length, breadth);
		    
		    System.out.println("Area of Rectangle is:"+ String.format("%.2f", rectangle.calculateArea()));
		}
		else if(shape == 2)
		{
			System.out.println("Enter side:");
			int side = sc.nextInt();
			
			Square square = new Square(side);
			
			System.out.println("Area of Square is:"+ String.format("%.2f", square.calculateArea()));
		}
		else if(shape == 3)
		{
			System.out.println("Enter Radius:");
			int radius = sc.nextInt();
			
			Circle circle = new Circle(radius);
			
			System.out.println("Area of circle is:"+ String.format("%.2f", circle.calculateArea()));
		}
	}
}
