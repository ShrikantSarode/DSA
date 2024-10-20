package queue;

import java.util.Scanner;

public class QueueDemo1 {

	private int Q[], MaxSize, front, rear;

	public void create_Queue(int size) {
		MaxSize = size;// init MaxSize front = 0;
		rear = -1;
		Q = new int[size];// create queue
	}

	public void Enqueue(int e) {
		rear++;
		Q[rear] = e;
		System.out.println("Element " + e + " Inserted in Queue");
	}

	public int Dequeue() {
		int temp = Q[front];
		front++;
		return (temp);
	}

	public boolean is_Empty() {
		if (front > rear)
			return true;
		else
			return false;
	}

	public boolean is_Full() {
		if (rear == MaxSize - 1)
			return true;
		else
			return false;
	}

	public void print_Queue() {
		// fifo print
		System.out.println("Queue has");
		for (int i = front; i <= rear; i++) {
			System.out.print(Q[i] + "--");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QueueDemo1 q = new QueueDemo1();

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
