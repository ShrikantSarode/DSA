package DSA_21OCT;

//C)Write a program to accept names from the user and sort in alphabetical order using bubble sort 
//-	Accept n name									
//-	Bubble sort Function							
//-	Display	

import java.util.Scanner;

public class Bubble_alpha {

	// Bubble sort function
	public static void bubbleSort(String[] names) {
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (names[j].compareTo(names[j + 1]) > 0) {

					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Accept number of names
		System.out.print("Enter the number of names: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] names = new String[n];

		// Accept names from the user
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[i] = sc.nextLine();
		}

		// Sort the names
		bubbleSort(names);

		// Display sorted names
		System.out.println("\nSorted names in alphabetical order:");
		for (String name : names) {
			System.out.println(name);
		}

		sc.close();

	}
}
