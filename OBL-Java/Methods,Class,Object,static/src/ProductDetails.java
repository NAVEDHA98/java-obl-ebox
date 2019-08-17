import java.util.Scanner;

class Product {
	long productId;
	String productName, supplierName;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}

public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the product id");
		long productId = new Long(s.nextLine());
		p.setProductId(productId);

		System.out.println("Enter the product name");
		p.setProductName(s.nextLine());

		System.out.println("Enter the supplier name");
		p.setSupplierName(s.nextLine());

		s.close();
		
		System.out.println("Product Id is " + p.productId);
		System.out.println("Product Name is " + p.productName);
		System.out.println("Supplier Name is " + p.supplierName);
	}

}
