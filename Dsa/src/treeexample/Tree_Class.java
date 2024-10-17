package treeexample;

import java.util.Scanner;

public class Tree_Class {

	Node root;

	void create_tree() {
		root = null;
	}

	void insert(Node r, Node n)// r= root and n=New node
	{
		if (root == null) {
			root = n;
		} else {
			if (n.data < r.data) {
				if (r.left == null)// empty left
				{
					r.left = n;
				} else {
					insert(r.left, n);// recurrsion call

				}
			} else {// if equal or greater than to right
				if (r.right == null)// empty left
				{
					r.right = n;
				} else {
					insert(r.right, n);// recurrsion call

				}
			}
		}
	}

	void inorder(Node r) {
		if (r != null) {// LPR
			inorder(r.left);// L
			System.out.print(r.data + ",");// P
			inorder(r.right);// L
		}
	}

	void preorder(Node r) {
		if (r != null) {// PLR
			System.out.print(r.data + ",");// P
			preorder(r.right);// L
			preorder(r.left);// R
		}
	}

	void postorder(Node r) {
		if (r != null) {// LRP
			postorder(r.left);// L
			postorder(r.right);// r
			System.out.print(r.data + ",");// P
		}
	}

	boolean search(int key) {
		if (root == null) {
			return false; // Key not found in the tree
		} else {
			Node r = root;
			while (r != null) {
				if (r.data == key) {
					return true; // Key found
				} else if (key < r.data) {
					r = r.left; // Search in left subtree
				} else {
					r = r.right; // Search in right subtree
				}
			}
			return false; // Key not found
		}
	}

	int depth(Node r) {
	    if (r == null) {
	        return 0;
	    } else {
	        int leftDepth = depth(r.left);
	        int rightDepth = depth(r.right);
	        return Math.max(leftDepth, rightDepth) + 1;
	    }
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Tree_Class obj = new Tree_Class();
		obj.create_tree();

		obj.insert(obj.root, new Node(10));
		obj.insert(obj.root, new Node(30));
		obj.insert(obj.root, new Node(20));
		obj.insert(obj.root, new Node(5));
		obj.insert(obj.root, new Node(15));

		System.out.println("Tree has:");
		System.out.println("\nIn-Order:");
		obj.inorder(obj.root);
		System.out.println("\n========================");
		System.out.println("\nPre-Order:");
		obj.preorder(obj.root);
		System.out.println("\n========================");
		System.out.println("\nPost-Order:");
		obj.postorder(obj.root);
		System.out.println("\n========================");
		
		System.out.println("Depth of tree:");
		System.out.println(obj.depth(obj.root)-1);

		System.out.println("Search Key:");

		int key = sc.nextInt();
		boolean found = obj.search(key);
		System.out.println("Key " + key + (found ? " found" : " not found") + " in the tree.");

	}

}
