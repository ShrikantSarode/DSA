package dsa_assignments;

// Employee Node class
public class EmpList {
    int id;
    String name;
    float sal;
    String email;
    EmpList next;

    public EmpList(int id, String name, float sal, String email) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.email = email;
        this.next = null; // Initialize next as null
    }
}

// Linked List class for managing employees
 class Emp {
    EmpList root;

    // Add a new employee to the list
    public void addEmployee(int id, String name, float sal, String email) {
        EmpList newEmployee = new EmpList(id, name, sal, email);
        if (root == null) {
            root = newEmployee;
        } else {
            EmpList temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEmployee;
        }
        System.out.println("Employee " + name + " registered successfully.");
    }

    // Find an employee by ID
    public EmpList findEmployee(int id) {
        EmpList temp = root;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Employee not found
    }

    // Display the employee list
    public void displayEmployees() {
        if (root == null) {
            System.out.println("No employees in the list.");
        } else {
            EmpList temp = root;
            while (temp != null) {
                System.out.println("ID: " + temp.id + ", Name: " + temp.name  + ", Salary: " + temp.sal + ", Email: " + temp.email);
                temp = temp.next;
            }
        }
    }

   
}
