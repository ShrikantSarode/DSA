package linkedlist;

import java.util.Scanner;

public class Dynamic_queue_class {
	Node front, rear;

	void create_Queue() {
		front = rear = null;
	}

	void Enqueue(int data) {
		Node n = new Node(data);
		if (rear == null) {
			front = rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
		System.out.println(data + " inserted");

	}

	void Dequeue() {
		if (front == null) {
			System.out.println("Empty Queue");
		} else {
			Node t;
			t = front;// 1
			if (front == rear)// single node
				front = rear = null;// reset else
			front = front.next;
			System.out.println(t.data + " dequeued");
		}
	}

	void print_queue() {
		if (front == null)
			System.out.println("Queue Empty");
		else {
			Node t = front;
			while (t != null) {
				System.out.print("|" + t.data + "|---");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) {
		Dynamic_queue_class obj = new Dynamic_queue_class();
		Scanner sc = new Scanner(System.in);

		int ch;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Print Queue");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Element:");
				int e = sc.nextInt();
				obj.Enqueue(e);
				break;
			case 2:
				obj.Dequeue();

				break;
			case 3:
				obj.print_queue();
				break;
			case 0:
				System.out.println("Exiting....");
				break;

			default:
				break;
			}
		} while (ch != 0);
	}

}