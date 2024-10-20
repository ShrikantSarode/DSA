package sortingLinkedList;
//using buuble sort
public class LinkedListSorted {

	Node root;

	void create() {
		root  = null;
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
	
	void sort() {
	    if (root == null || root.next == null) {
	        return;
	    }
	    Node t = root;
	    while (t != null) {
	        Node t2 = t.next;
	        while (t2 != null) {
	            if (t.data > t2.data) {
	                int temp = t.data;
	                t.data = t2.data;
	                t2.data = temp;
	            }
	            t2 = t2.next;
	        }
	        t = t.next; // Update to t = t.next instead of t2 = t.next
	    }
	}


	    void print() {
	        Node t = root;
	        while (t != null) {
	            System.out.print(t.data + " ");
	            t = t.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        LinkedListSorted list = new LinkedListSorted();
	        list.create();
	        list.insert(50);
	        list.insert(20);
	        list.insert(40);
	        list.insert(10);
	        list.insert(30);

	        System.out.println("Before Sorting:");
	        list.print();

	        list.sort();

	        System.out.println("After Sorting:");
	        list.print();
	    }
	}