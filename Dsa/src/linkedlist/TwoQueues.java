package linkedlist;

import java.util.Scanner;

public class TwoQueues {
	int[] arr;
	int size;
	int front1, rear1, front2, rear2;

	public TwoQueues(int n) {
		size = n;
		arr = new int[n];
		front1 = rear1 = -1;
		front2 = rear2 = size;
	}

	public void enqueue1(int x) {
		if (rear1 + 1 < front2) {
			if (front1 == -1)
				front1 = 0;
			arr[++rear1] = x;
		} else {
			System.out.println("Queue 1 Overflow");
		}
	}

	public void enqueue2(int x) {
		if (rear1 + 1 < front2) {
			if (front2 == size)
				front2 = size - 1;
			arr[--rear2] = x;
		} else {
			System.out.println("Queue 2 Overflow");
		}
	}

	public int dequeue1() {
		if (front1 <= rear1 && front1 != -1) {
			int x = arr[front1];
			if (front1 == rear1)
				front1 = rear1 = -1;
			else
				front1++;
			return x;
		} else {
			System.out.println("Queue 1 Underflow");
			return -1;
		}
	}

	public int dequeue2() {
		if (front2 <= rear2 && front2 != size) {
			int x = arr[front2];
			if (front2 == rear2)
				front2 = rear2 = size;
			else
				front2--;
			return x;
		} else {
			System.out.println("Queue 2 Underflow");
			return -1;
		}
	}

	public void printQueue1() {
		if (front1 != -1) {
			for (int i = front1; i <= rear1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Queue 1 is empty");
		}
	}

	public void printQueue2() {
		if (front2 != size) {
			for (int i = front2; i <= rear2; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Queue 2 is empty");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the capacity of the array: ");
		int capacity = sc.nextInt();
		TwoQueues queues = new TwoQueues(capacity);

		int choice, element;
		do {
			System.out.println("Menu:");
			System.out.println("1. Enqueue to Queue 1");
			System.out.println("2. Dequeue from Queue 1");
			System.out.println("3. Print Queue 1");
			System.out.println("4. Enqueue to Queue 2");
			System.out.println("5. Dequeue from Queue 2");
			System.out.println("6. Print Queue 2");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to enqueue to Queue 1: ");
				element = sc.nextInt();
				queues.enqueue1(element);
				break;
			case 2:
				System.out.println("Dequeued from Queue 1: " + queues.dequeue1());
				break;
			case 3:
				queues.printQueue1();
				break;
			case 4:
				System.out.print("Enter element to enqueue to Queue 2: ");
				element = sc.nextInt();
				queues.enqueue2(element);
				break;
			case 5:
				System.out.println("Dequeued from Queue 2: " + queues.dequeue2());
				break;
			case 6:
				queues.printQueue2();
				break;
			case 7:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 7);
		sc.close();
	}
}
