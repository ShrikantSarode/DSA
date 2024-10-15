package linkedlist;

import java.util.Scanner;

public class Dynamic_stack_class {
	Node tos;

	void create_stack() {
		tos = null;// preparing with empty tos
	}

	void push(int data) {
		Node n = new Node(data);
		if (tos == null) {
			tos = n;// n becomes 1st so root
		} else {
			n.next = tos;// 1 tos = n;//2
		}
		System.out.println(tos.data + " pushed on stack");

	}

	void pop() {
		if (tos == null) {
			System.out.println("Empty Stack");
		} else {
			Node t;
			t = tos;// 1
			tos = tos.next;// 2
			System.out.println(t.data + " poped");
		}
	}

	void peek() {
		if (tos == null) {
			System.out.println("Empty Stack");
		} else {
			System.out.println(tos.data + " @ peek");
		}
	}

	void print_stack() {
		if (tos == null)
			System.out.println("Stack Empty");
		else {
			Node t = tos;
			while (t != null) {
				System.out.println(t.data);
				System.out.println("--------");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) {
		
		 Dynamic_stack_class obj = new Dynamic_stack_class();
	        obj.create_stack(); // Initialize the stack
	        Scanner in = new Scanner(System.in);

	        int ch;
	        do {
	            System.out.println("Stack Menu");
	            System.out.println("--------------------");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Print All Elements");
	            System.out.println("5. Exit");
	            System.out.println("---------------------");
	            System.out.print("Enter choice: ");
	            ch = in.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Enter an element to push: ");
	                    int element = in.nextInt();
	                    obj.push(element);
	                    break;
	                case 2:
	                    obj.pop();
	                    break;
	                case 3:
	                    obj.peek();
	                    break;
	                case 4:
	                    obj.print_stack();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } while (ch != 5);
	}

}