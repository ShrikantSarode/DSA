package dsa_assignments;

import java.util.Scanner;

//A) Write a  program to accept a string from user and reverse it 
//using Static implementation of Stack.
public class A_Stack {

	private int MaxSize, tos;
	private char stack[];

	void create_stack(int size) {
		tos = -1;
		stack = new char[size];
		MaxSize = size;

	}

	void push(char e) {
		tos++;
		stack[tos] = e;
		System.out.println( e + " Added.");
	}

	char pop() {
		return (stack[tos--]);

	}

	void print() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);

		}
	}

	boolean isEmpty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		A_Stack obj = new A_Stack();

		System.out.println("Enter Word: ");
		String word = sc.next();

		obj.create_stack(word.length());

		for (int i = 0; i < word.length(); i++) {
			obj.push(word.charAt(i));
		}
		
		String r_word="";
		while(obj.isEmpty() !=true)
		{
			r_word += obj.pop();
		}
		System.out.println("Reverse String is: "+r_word);
	}

}
