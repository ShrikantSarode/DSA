package stack;

import java.util.Scanner;

public class Binary {

	private int MaxSize, tos;
	private int stack[];

	Scanner sc = new Scanner(System.in);

	public void create_Stack(int size) {

		tos = -1; // init tos
		stack = new int[size]; // create stack
		MaxSize = size; // init MaxSize

	}

	void push(int e) {

		tos++;
		stack[tos] = e;

		System.out.println("Element " + e + " Pushed:");
	}

	boolean is_Full()

	{
		
			if (tos == MaxSize - 1) {
				return true;
			}

			else {
				return false;

			}
		} 
	

	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);

	}
	// return(stack[tos--]);

	boolean is_Empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		return (stack[tos]);
	}

	void print_Stack() {// lifo print
		System.out.println("Binary is: ");
		for (int i = tos; i >= 0; i--) {
			System.out.print(stack[i]);
		}

	}

	void checkBinary(int n) {
		while (n != 0) {
			push(n % 2);
			n = n / 2;
		}
	}

	public static void main(String[] args) {
		Binary obj = new Binary();
		Scanner in = new Scanner(System.in);

		obj.create_Stack(4);

		System.out.println("Enter number to convert into Binary: ");
		int n = in.nextInt();

		obj.checkBinary(n);
		obj.print_Stack();

	}
}
