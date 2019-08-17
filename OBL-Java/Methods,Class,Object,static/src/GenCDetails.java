import java.util.Scanner;

class Student {
	int employeeId;
	String name;
	private static final String COHORT_CODE = "CHNAJ19004";

	Student() {
		employeeId = 0;
		name = "Employee";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return name;
	}

	public void setEmployeeName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(employeeId + " " + name + " " + COHORT_CODE);
	}

	@Override
	public String toString() {
		return "Student [employeeId=" + employeeId + ", name=" + name + "]";
	}

}

public class GenCDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of GenCs");
		int n = new Integer(sc.nextLine());

		Student[] s = new Student[n];

		for (int i = 0; i < n; i++) {

			s[i] = new Student();

			System.out.println("Enter Employee Id");
			s[i].setEmployeeId(new Integer(sc.nextLine()));

			System.out.println("Enter Name");
			s[i].setEmployeeName(sc.nextLine());

		}

		for (Student s1 : s)
			s1.display();

		sc.close();
	}

}
