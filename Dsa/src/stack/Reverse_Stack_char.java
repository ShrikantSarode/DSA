package stack;

import java.util.Scanner;

public class Reverse_Stack_char {

	private int MaxSize, tos;
	private char stack[];

	Scanner sc = new Scanner(System.in);

	public void create_Stack(int size) {

		tos = -1; // init tos
		stack = new char[size]; // create stack
		MaxSize = size; // init MaxSize

	}

	void push(char e) {

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

	char pop() {
		char temp = stack[tos];
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

	char peek() {
		return (stack[tos]);
	}

	void print_Stack() {// lifo print System.out.println("Stack has");
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}

	}

	public static void main(String[] args) {
		Reverse_Stack_char obj = new Reverse_Stack_char();

		Scanner in = new Scanner(System.in);
		// object created
		System.out.println("Enter word");
		String word = in.next();// read word from user
		
		obj.create_Stack(word.length());

		for (int i = 0; i < word.length(); i++)// character by charater copy element to stack till all characters are over
		{
			
			obj.push(word.charAt(i));

		}
		String r_word = "";
		while (obj.is_Empty() != true)// pop and copy each poped element to reverse string till stack over
		{
			r_word += obj.pop();

			System.out.println("Reverse is:" + r_word);// print reverse string
		}

	}
}
