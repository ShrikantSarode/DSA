package dsa_assignments;


public class DoubleLinkedList {
	Node1 root, last,left;

	void create_List() {
		root = last = null;
	}

	void right_Insert(int data) {
		Node1 newNode = new Node1(data);
		if (root == null) {
			root = last = newNode;
			last.next = root;
		} else {
			last.next = newNode;
			last = newNode;
			last.next = root;
		}
		System.out.println(data + " inserted on the right");
	}

	void deleteLeft() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root == last) {

			System.out.println(root.data + " deleted from the left");
			root = last = null;
			Node1 t = root;
			root = root.next;
			last.next = root;
			System.out.println(t.data + " deleted from the left");
		}
	}
	void deleteRight() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root == last) {
		
			System.out.println(root.data + " deleted from the right");
			root = last = null; 
		} else {
			Node1 t, t2;
			t = t2 = root;
			while (t != last) {
				t2 = t;
				t = t.next;
			}
			System.out.println(last.data + " deleted from the right");
			t2.next = root; 
			last = t2; 
		}
	}

	void printList() {
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Node1 t = root;
			do {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			} while (t != root);  
			System.out.println("|" + root.data + "|");  
		}
	}
	void print_list_rev() {
	    if (root == null) {
	        System.out.println("List Empty");
	    } else {
	        Node1 t = last;
	        do {
	            System.out.print("<-|" + t.data + "|->");
	            t = t.next;//error here need to be t.last
	        } while (t != last);  
	        System.out.println("<-|" + last.data + "|"); 
	    }
	}


}