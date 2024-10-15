package linkedlist;

import java.util.Scanner;

public class LinkedListDemo1 {

    Node root; // Head of the linked list

    public LinkedListDemo1() {
        root = null; // Initialize with an empty list
    }

    void insertLeft(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n; // If list is empty, set root to new node
        } else {
            n.next = root; // Point new node to current root
            root = n;      // Update root to the new node
        }
        System.out.println(data + " inserted on the left");
    }

    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root; // Keep track of the node to delete
            root = root.next; // Move root to the next node
            System.out.println(t.data + " deleted from the left");
        }
    }

    void insertRight(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n; // If list is empty, set root to new node
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next; // Traverse to the last node
            }
            t.next = n; // Link the last node to the new node
        }
        System.out.println(data + " inserted on the right");
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root, t2 = null; // Use two pointers to find the last node
            while (t.next != null) {
                t2 = t; // t2 will be the second last node
                t = t.next; // Move t to the last node
            }
            if (t == root) {
                root = null; // Reset root if there's only one node
            } else {
                t2.next = null; // Remove the last node
            }
            System.out.println(t.data + " deleted from the right");
        }
    }

    void printList() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next; // Move to the next node
            }
            System.out.println("null"); // End of the list
        }
    }

    void searchList(int data) {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == data) { // Match found
                    System.out.println(data + " found in list");
                    return; // Exit method once found
                }
                t = t.next; // Move to the next node
            }
            System.out.println(data + " not found in list"); // Not found
        }
    }
    public static void main(String[] args) {
    	LinkedListDemo1 ll = new LinkedListDemo1();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the left");
            System.out.println("2. Insert at the right");
            System.out.println("3. Delete from the left");
            System.out.println("4. Delete from the right");
            System.out.println("5. Search for an element");
            System.out.println("6. Print the list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the left: ");
                    int leftValue = scanner.nextInt();
                    ll.insertLeft(leftValue);
                    break;

                case 2:
                    System.out.print("Enter value to insert at the right: ");
                    int rightValue = scanner.nextInt();
                    ll.insertRight(rightValue);
                    break;

                case 3:
                    ll.deleteLeft();
                    break;

                case 4:
                    ll.deleteRight();
                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    ll.searchList(searchValue);
                    break;

                case 6:
                    ll.printList();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
	}

