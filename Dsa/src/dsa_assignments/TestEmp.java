package dsa_assignments;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Emp list = new Emp();
		int choice;

		do {
			System.out.println("\nEmployee Management System:");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Salary: ");
				float salary = scanner.nextFloat();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Email: ");
				String email = scanner.nextLine();
				list.addEmployee(id, name, salary, email);
				break;
			case 2:
				list.displayEmployees();
				break;
			case 3:
				System.out.print("Enter ID to search: ");
				int searchId = scanner.nextInt();
				EmpList employee = list.findEmployee(searchId);
				if (employee != null) {
					System.out.println("Employee found: ID: " + employee.id + ", Name: " + employee.name + ", Salary: "
							+ employee.sal + ", Email: " + employee.email);
				} else {
					System.out.println("Employee with ID " + searchId + " not found.");
				}
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}