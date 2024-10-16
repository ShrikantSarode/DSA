package linkedlist;

import java.util.Scanner;

public class Circular_linked_list_class {
	Node root, last; // Head of the linked list

	void create_list() {
		root = last = null; // Preparing with empty root
	}

	void insertLeft(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = last = n; // If list is empty, set root to new node
		} else {
			n.next = root; // Point new node to current root
			root = n; // Update root to the new node
			last.next = root; // Maintain circular link
		}
		System.out.println(data + " inserted on the left");
	}

	void deleteLeft() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root == last) {
			// Only one node in the list
			System.out.println(root.data + " deleted from the left");
			root = last = null; // List becomes empty
		} else {
			Node t = root; // Keep track of the node to delete
			root = root.next; // Move root to the next node
			last.next = root; // Maintain circular link
			System.out.println(t.data + " deleted from the left");
		}
	}

	void insertRight(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = last = n; // If list is empty, set root to new node
			last.next = root; // Maintain circular link
		} else {
			last.next = n; // Last node's next points to new node
			last = n; // Update last to new node
			last.next = root; // New node's next points to root
		}
		System.out.println(data + " inserted on the right");
	}

	void deleteRight() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root == last) {
			// Only one node in the list
			System.out.println(root.data + " deleted from the right");
			root = last = null; // List becomes empty
		} else {
			Node t, t2;
			t = t2 = root;
			while (t != last) {
				t2 = t; // Move t to the second last node
				t = t.next;
			}
			System.out.println(last.data + " deleted from the right");
			t2.next = root; // Update second last node to point to root
			last = t2; // Update last to second last node
		}
	}

	void printList() {
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Node t = root;
			do {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			} while (t != root); // Stop when back at root
			System.out.println("|" + root.data + "|"); // Maintain circular structure
		}
	}

	public static void main(String[] args) {
		Circular_linked_list_class ll = new Circular_linked_list_class();
		Scanner in = new Scanner(System.in);
		int choice, e;
		ll.create_list(); // Creating LinkedList

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Insert at the left");
			System.out.println("2. Insert at the right");
			System.out.println("3. Delete from the left");
			System.out.println("4. Delete from the right");
			System.out.println("5. Print the list");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = in.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to insert at the left: ");
				int leftValue = in.nextInt();
				ll.insertLeft(leftValue);
				break;

			case 2:
				System.out.print("Enter value to insert at the right: ");
				int rightValue = in.nextInt();
				ll.insertRight(rightValue);
				break;

			case 3:
				ll.deleteLeft();
				break;

			case 4:
				ll.deleteRight();
				break;

		
			case 5:
				ll.printList();
				break;

			
			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 0);

	}
}
