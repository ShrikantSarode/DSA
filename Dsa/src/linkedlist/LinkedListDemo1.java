package linkedlist;

import java.util.Scanner;


public class LinkedListDemo1 {

    Node root; // Head of the linked list

    public LinkedListDemo1() {
        root = null; // Initialize with an empty list
    }

    void create_list() {
        root = null; // Preparing with empty root
    }

    void insertLeft(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n; // If list is empty, set root to new node
        } else {
            n.next = root; // Point new node to current root
            root = n; // Update root to the new node
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

    void delete_element(int data) {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t, t2;
            t2 = t = root;
            while (t != null) {
                if (t.data == data) { // Match found
                    if (t == root) { // Case 1: Deleting the root
                        root = root.next;
                    } else if (t.next == null) { // Case 2: Deleting the last node
                        t2.next = null;
                    } else { // Case 3: Deleting a node in between
                        t2.next = t.next;
                    }
                    System.out.println(t.data + " deleted");
                    break; // Stop the loop
                }
                t2 = t;
                t = t.next;
            }
            if (t == null) // Not found
                System.out.println(data + " not found in list");
        }
    }

    void insert_after(int key, int new_data) {
        Node n = new Node(new_data);
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == key) { // Match found
                    n.next = t.next; // Link new node to the next node
                    t.next = n; // Insert new node
                    System.out.println(new_data + " inserted after " + key);
                    return;
                }
                t = t.next;
            }
            System.out.println(key + " not found in list");
        }
    }

    void insert_before(int key, int new_data) {
        Node n = new Node(new_data);
        if (root == null) {
            System.out.println("List Empty");
            return;
        }
        
        if (root.data == key) { // If inserting before the head
            n.next = root;
            root = n;
            System.out.println(new_data + " inserted before " + key);
            return;
        }

        Node t = root;
        while (t.next != null) {
            if (t.next.data == key) { // Match found
                n.next = t.next; // Link new node to the next node
                t.next = n; // Insert new node
                System.out.println(new_data + " inserted before " + key);
                return;
            }
            t = t.next;
        }
        System.out.println(key + " not found in list");
    }

    public static void main(String[] args) {
        LinkedListDemo1 ll = new LinkedListDemo1();
        Scanner in = new Scanner(System.in);
        int choice, e;
        ll.create_list(); // Creating LinkedList

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the left");
            System.out.println("2. Insert at the right");
            System.out.println("3. Delete from the left");
            System.out.println("4. Delete from the right");
            System.out.println("5. Search for an element");
            System.out.println("6. Print the list");
            System.out.println("7. Delete element");
            System.out.println("8. Insert after");
            System.out.println("9. Insert before"); // New option for insert before
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
                    System.out.print("Enter value to search: ");
                    int searchValue = in.nextInt();
                    ll.searchList(searchValue);
                    break;

                case 6:
                    ll.printList();
                    break;

                case 7:
                    System.out.print("Enter element to delete: ");
                    e = in.nextInt();
                    ll.delete_element(e);
                    break;

                case 8:
                    System.out.print("Enter element to insert after: ");
                    e = in.nextInt();
                    System.out.print("Enter element to search: ");
                    int keyAfter = in.nextInt();
                    ll.insert_after(keyAfter, e);
                    break;

                case 9:
                    System.out.print("Enter element to insert before: ");
                    e = in.nextInt();
                    System.out.print("Enter element to search: ");
                    int keyBefore = in.nextInt();
                    ll.insert_before(keyBefore, e);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        in.close();
    }
}
