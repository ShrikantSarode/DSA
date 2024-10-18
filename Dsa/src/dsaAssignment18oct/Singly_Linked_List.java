package dsaAssignment18oct;

public class Singly_Linked_List {
	DNode root, last;

	void insert_left(int data) {
		DNode n = new DNode(data);
		if (root == null) {
			root = last = n;
			last.next = root;
		} else {
			n.next = root;
			root = n;
			last.next = root;
		}
	}

	void print_alternate() {
		if (root == null) {
			System.out.println("List is empty.");
			return;
		}
		DNode t = root;
		boolean print = true;
		do {
			if (print) {
				System.out.print(t.data + " ");
			}
			print = !print;
			t = t.next;
		} while (t != root);
		System.out.println();
	}

	public static void main(String[] args) {
		Singly_Linked_List list = new Singly_Linked_List();
		list.insert_left(10);
		list.insert_left(20);
		list.insert_left(50);
		list.insert_left(11);
		list.insert_left(32);

		list.print_alternate();  
	}
}
