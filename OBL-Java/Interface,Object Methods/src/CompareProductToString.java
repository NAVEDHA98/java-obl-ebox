import java.util.Scanner;

class Product1 {

	private Long id;
	private String productName, supplierName;

	Product1() {

	}

	public Product1(Long id, String productName, String supplierName) {
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
	public String toString() {
		return id + " : " + productName + " : " + supplierName;
	}

}

public class CompareProductToString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product1 p1 = new Product1();

		System.out.println("Enter the product id");
		p1.setId(new Long(sc.nextLine()));
		System.out.println("Enter the product name");
		p1.setProductName(sc.nextLine());
		System.out.println("Enter the supplier name");
		p1.setSupplierName(sc.nextLine());

		System.out.println(p1);
		System.out.println("Invoking getClass() method: class " + p1.getClass());
		
		sc.close();
	}
}
