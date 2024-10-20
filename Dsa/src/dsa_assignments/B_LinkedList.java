package dsa_assignments;

public class B_LinkedList {
	Node1 head;

	public void addSorted(int data) {
		Node1 newNode = new Node1(data);
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node1 current = head;
			while (current.next != null && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
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

	public B_LinkedList union(B_LinkedList list2) {
		B_LinkedList result = new B_LinkedList();
		Node1 temp1 = this.head;
		Node1 temp2 = list2.head;
		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				result.addSorted(temp1.data);
				temp1 = temp1.next;
			} else if (temp1.data > temp2.data) {
				result.addSorted(temp2.data);
				temp2 = temp2.next;
			} else {
				result.addSorted(temp1.data);
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		while (temp1 != null) {
			result.addSorted(temp1.data);
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			result.addSorted(temp2.data);
			temp2 = temp2.next;
		}
		return result;
	}

	public static void main(String[] args) {
		B_LinkedList list1 = new B_LinkedList();
		B_LinkedList list2 = new B_LinkedList();

		list1.addSorted(1);
		list1.addSorted(3);
		list1.addSorted(5);

		list2.addSorted(2);
		list2.addSorted(3);
		list2.addSorted(4);
		list2.addSorted(6);

		System.out.println("List 1:");
		list1.display();

		System.out.println("List 2:");
		list2.display();

		B_LinkedList unionList = list1.union(list2);
		System.out.println("Union of List 1 and List 2:");
		unionList.display();
	}
}
