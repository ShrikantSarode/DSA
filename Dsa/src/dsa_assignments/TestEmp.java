package dsa_assignments;

public class TestEmp {
	
	 public static void main(String[] args) {
	        Emp list = new Emp();
	        list.addEmployee(1, "Alice", 80000, "Shrikant124@gmail.com");
	        list.addEmployee(2, "Bob", 60000, "Rahul@gmail.com");
	        list.addEmployee(3, "Charlie", 50000, "Sudarshan@gmail.com");

	        list.displayEmployees();

	        int searchId = 2;
	        EmpList employee = list.findEmployee(searchId);
	        if (employee != null) {
	            System.out.println("Employee found: ID: " + employee.id + ", Name: " + employee.name + ", Salary: " + employee.sal + ", Email: " + employee.email);
	        } else {
	            System.out.println("Employee with ID " + searchId + " not found.");
	        }
	    }

}
