package DSA_21OCT;

public class Node {

	Node next, left, right, last;
	int data;

	public Node(int data) {

		this.data = data;
		this.left = this.right;
		this.next = null;
		 
	}

}
