package sortingLinkedList;

import stack.StackDemo1;
//using stack
public class ReverseList {

	Node root;
	StackDemo1 obj;

	void create() {
		root = null;

	}

	void write_to_stack() {
		int length = 0;
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Node t = root;
			while (t != null) {
				length++;
				t = t.next;
			}
			// create stack of size of length
			obj.create_Stack(length);

			// read all elements and push on stack
			t = root;
			while (t != null) {
				obj.push(t.data);
				t = t.next;
			}

			// Traverse the linked list again to write back the data from the stack
			t = root;
			while (t != null) {
				obj.pop();
				t = t.next;
			}
		}
	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;

		}
	}

	void print() {
		Node t = root;
		while (t != null) {
			System.out.print("|"+ t.data + "|-> ");
			t = t.next;
		}

	}

	public static void main(String[] args) {

		ReverseList list = new ReverseList();
		list.create();
		list.insert(10);
		list.insert(15);
		list.insert(20);
		list.insert(25);
		System.out.println("Reverse list :");
		list.print();
	}
}
