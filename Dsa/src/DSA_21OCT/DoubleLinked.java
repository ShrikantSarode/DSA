package DSA_21OCT;

//B) Write a  program to create doubly link list and display nodes having odd value.
public class DoubleLinked {
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
			root.left = last.right = null;
		} else {

			last.right = n;
			last = n;
			System.out.println(data + " Inserted");
		}
	}

	void displayOddNodes() {
	    Node t = root;
	    System.out.println("Odd Nodes: ");
	    while (t != null) {
	        if (t.data % 2 != 0) {
	            System.out.print("|" + t.data + "|->");
	        }
	        t = t.right;
	    }
	    System.out.println();  
	}

	public static void main(String[] args) {
		DoubleLinked list = new DoubleLinked();
		list.create();
		list.Insert_right(1);
		list.Insert_right(4);
		list.Insert_right(8);
		list.Insert_right(2);
		list.Insert_right(11);
		list.Insert_right(7);
		list.displayOddNodes();
	}

}
