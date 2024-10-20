package DSA_21OCT;

//A) Write a menu driven program for singly linked list-
//-	To create linked list.
//-	To display linked list
//-	To search node in linked list.
//-	Insert at last position
public class LinkedList {

	Node root, last;

	void create() {
		if (root == null) {
			root = last = null;
		}
	}

	void Insert_right(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = last = n;
		} else {

			last.next = n;
			last = n;
			System.out.println(data + " Inserted");
		}
	}

	void search(int key) {
		Node t = root;
		int position = 0;
		boolean found = false;
		while (t != null) {
			if (t.data == key) {
				found = true;
				break;
			}
			t = t.next;
			position++;
		}
		if (found) {
			System.out.println("\n\nElement " + key + " found at position " + position);
		} else {
			System.out.println("\n\nElement " + key + " not found in the list");
		}
	}

	void display() {
		Node t;
		t = root;
		while (t != null) {
			System.out.print("|" + t.data + "|->");
			t = t.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.create();
		list.Insert_right(1);
		list.Insert_right(4);
		list.Insert_right(8);
		list.Insert_right(2);
		list.Insert_right(11);
		list.Insert_right(7);
		list.display();
		list.search(8);
	}
}
