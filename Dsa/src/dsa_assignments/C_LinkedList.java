package dsa_assignments;

public class C_LinkedList {
	Node1 head;

	public void addDigit(int data) {
		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
		} else {
			Node1 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void display() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		C_LinkedList list = new C_LinkedList();
		int number = 368;

	 
		while (number > 0) {
			int digit = number % 10;
			list.addDigit(digit);
			number /= 10;
		}

 
		list.head = reverseList(list.head);

		System.out.println("Linked List:");
		list.display();
	}

 
	public static Node1 reverseList(Node1 head) {
		Node1 prev = null;
		Node1 current = head;
		Node1 next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
