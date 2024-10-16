package queue;

import java.util.Scanner;

public class CircularQueue {

	private int Q[], MaxSize, front, rear, count = 0;

	public void create_Queue(int size) {
		MaxSize = size; // Initialize MaxSize
		front = 0;
		rear = -1;
		Q = new int[size]; // Create queue
	}

	void Enqueue(int e) {
		if (is_Full()) {
			System.out.println("Queue is full! Cannot insert " + e);
			return;
		}
		rear = (rear + 1) % MaxSize; // Circular increment
		Q[rear] = e;
		count++;
		System.out.println("Element " + e + " inserted in queue.");
	}

	int Dequeue() {
		if (is_Empty()) {
			System.out.println("Queue is empty! Cannot dequeue.");
			return -1; // Indicate queue is empty
		}
		int temp = Q[front];
		front = (front + 1) % MaxSize; // Circular increment
		count--;
		return temp;
	}

	boolean is_Empty() {
		return count == 0; // Check if count is zero
	}

	boolean is_Full() {
		return count == MaxSize; // Check if count equals MaxSize
	}

	void print_Queue() {
		if (is_Empty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Queue has: ");
//        for (int i = 0; i < count; i++) {
//            System.out.print(Q[(front + i) % MaxSize] + " ");
//        }
//        System.out.println();
		int i, c;
		i = front;
		c = 0;

		while (c < count) {
			System.out.print(" | " + Q[i]);
			i = (i + 1) % MaxSize;
			c++;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CircularQueue q = new CircularQueue();

		System.out.print("Enter the size of the queue: ");
		int size = scanner.nextInt();
		q.create_Queue(size);

		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Check if Empty");
			System.out.println("4. Check if Full");
			System.out.println("5. Print Queue");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to enqueue: ");
				int element = scanner.nextInt();
				q.Enqueue(element);
				break;
			case 2:
				int dequeuedElement = q.Dequeue();
				if (dequeuedElement != -1) {
					System.out.println("Dequeued element: " + dequeuedElement);
				}
				break;
			case 3:
				System.out.println(q.is_Empty() ? "Queue is empty." : "Queue is not empty.");
				break;
			case 4:
				System.out.println(q.is_Full() ? "Queue is full." : "Queue is not full.");
				break;
			case 5:
				q.print_Queue();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);

		scanner.close();
	}
}
