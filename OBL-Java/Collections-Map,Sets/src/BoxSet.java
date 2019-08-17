import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Box {
	double length, width, height;

	public Box() {

	}

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return (int) (length * height * width);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Box b = (Box) obj;
		return (this.length * this.height * this.width) == (b.length * b.height * b.width);
	}

	public void displayBox(HashSet<Box> s) {
		System.out.println("Unique Boxes in the Set are");
		Iterator<Box> itr = s.iterator();
		while (itr.hasNext()) {
			Box b = (Box) itr.next();
			System.out.printf("Length = %.0f Width = %.0f Height = %.0f Volume = %.2f\n", b.length, b.width, b.height,
					b.length * b.width * b.height);
		}
	}

}

public class BoxSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Box");
		int n = new Integer(sc.nextLine());

		HashSet<Box> s = new HashSet<Box>(n);

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Box " + (i + 1) + " details");

			System.out.println("Enter Length");
			double length = new Double(sc.nextDouble());

			System.out.println("Enter Width");
			double width = new Double(sc.nextDouble());

			System.out.println("Enter Height");
			double height = new Double(sc.nextDouble());

			Box b = new Box(length, width, height);
			s.add(b);
		}

		Box b = new Box();
		b.displayBox(s);
		sc.close();
	}

}