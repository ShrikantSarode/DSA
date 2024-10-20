package sortingLinkedList;

import stack.StackDemo1;

public class Queue_Stack {

	StackDemo1 s1, s2;

	void create_Queue(int size) {
		s1 = new StackDemo1();
		s1.create_Stack(size);
		s2 = new StackDemo1();
		s2.create_Stack(size);
	}

	// Enqueue operation
	public void enqueue(int data) {

		s1.push(data);
	}

	// Dequeue operation
	public void dequeue() {

		while (!s1.is_Empty()) {
			s2.push(s1.pop());
		}

		int temp = s2.pop();
		while (!s2.is_Empty()) {
			s1.push(temp);
		}
		s1.print_Stack();
//		while(!s2.)
//		{
//			
//		}
	}

	// Display queue
//	public void display() {
//		System.out.println("Elements in queue:");
//		if (!s2.is_Empty()) {
//			for (int i = s2.MaxSize; i >= 0; i--) {
//				System.out.print(s2.get(i) + " ");
//			}
//		}
//		if (!s1.is_Empty()) {
//			for (int i = 0; i < s1.MaxSize; i++) {
//				System.out.print(s1.get(i) + " ");
//			}
//		}
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//		Queue_Stack queue = new Queue_Stack();
//
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.display(); // Displays: 10 20 30
//
//		System.out.println("Dequeued: " + queue.dequeue()); // Dequeues 10
//		queue.display(); // Displays: 20 30
//
//		queue.enqueue(40);
//		queue.display(); // Displays: 20 30 40
//
//		System.out.println("Dequeued: " + queue.dequeue()); // Dequeues 20
//		queue.display(); // Displays: 30 40
//	}
}
