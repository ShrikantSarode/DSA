package assignment;

//Problem Definition: Circular Doubly Linked List in JavaObjective:
//Implement a circular doubly linked list data structure in Java, providing the following operations:
//
//Insert a new node at the end (rightmost) of the list.
//Remove the leftmost node from the list.
//Remove the rightmost node from the list.
//Traverse the list from the head to the tail and print the value of each node.
//Traverse the list from the tail to the head and print the value of each node.
public class Node1 {

	Node1 next;
	int data;

	public Node1(int data) {

		this.data = data;
		this.next = null;
	}

}
