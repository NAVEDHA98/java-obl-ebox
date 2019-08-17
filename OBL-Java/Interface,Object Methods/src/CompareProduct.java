import java.util.Scanner;

class Product {

	private Long id;
	private String productName, supplierName;

	Product() {

	}

	public Product(Long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;

		if (!(obj instanceof Product))
			return false;

		Product j = (Product) obj;

		if (j.id.equals(this.id) && j.productName.equals(this.productName) && j.supplierName.equals(this.supplierName))
			return true;
		else
			return false;
	}

	public void display() {
		System.out.println(
				"Product Id is " + id + "\nProduct Name is " + productName + "\nSupplier Name is " + supplierName);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", supplierName=" + supplierName + "]";
	}

}

public class CompareProduct {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product p1 = new Product();
		Product p2 = new Product();

		System.out.println("Enter the product id");
		p1.setId(new Long(sc.nextLine()));
		System.out.println("Enter the product name");
		p1.setProductName(sc.nextLine());
		System.out.println("Enter the supplier name");
		p1.setSupplierName(sc.nextLine());
		p1.display();

		System.out.println("Enter the product id");
		p2.setId(new Long(sc.nextLine()));
		System.out.println("Enter the product name");
		p2.setProductName(sc.nextLine());
		System.out.println("Enter the supplier name");
		p2.setSupplierName(sc.nextLine());
		p2.display();

		if (p1.equals(p2))
			System.out.println("The products are same");
		else
			System.out.println("The products are different");

		sc.close();
	}
}
