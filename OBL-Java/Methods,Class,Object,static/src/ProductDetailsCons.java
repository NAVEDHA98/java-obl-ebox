import java.util.Scanner;

class Product1 {
	long productId;
	String productName, supplierName;

	public Product1() {

	}

	public Product1(long productId, String productName, String supplierName) {
		this.productId = productId;
		this.productName = productName;
		this.supplierName = supplierName;
	}
}

public class ProductDetailsCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long productId;
		String productName, supplierName;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the product id");
		productId = new Long(s.nextLine());

		System.out.println("Enter the product name");
		productName = s.nextLine();

		System.out.println("Enter the supplier name");
		supplierName = s.nextLine();

		Product1 p = new Product1(productId, productName, supplierName);

		s.close();

		System.out.println("Product Id is " + p.productId);
		System.out.println("Product Name is " + p.productName);
		System.out.println("Supplier Name is " + p.supplierName);
	}

}
