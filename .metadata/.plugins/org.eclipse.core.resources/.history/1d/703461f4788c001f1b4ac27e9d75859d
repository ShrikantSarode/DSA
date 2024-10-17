package assignment;

import java.util.Scanner;

public class AssignmentMain {

	public static void main(String[] args) {

		DoubleLinkedList obj = new DoubleLinkedList();

		Scanner sc = new Scanner(System.in);

		int ch;
		do {
			System.out.println("Menu");
			System.out.println("1.Insert From Right.");
			System.out.println("2.Remove From Left.");
			System.out.println("3.Remove From Right.");
			System.out.println("4.Print From Head.");
			System.out.println("5.Print From Last.");
			System.out.println("0.Exiting.");
			System.out.println("Enter choice:");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				int e;
				System.out.println("Enter Element to Insert:");
				e = sc.nextInt();
				obj.right_Insert(e);
				break;
			case 2:
				obj.deleteLeft();
				break;
			case 3:
				obj.deleteRight();
				break;
			case 4:
				obj.printList();
				break;
			case 5:
				obj.print_list_rev();
				break;

			case 0:
				System.out.println("Exiting...");
				break;
				
			default:System.out.println("Invalid choice");
				break;
			}
		} while (ch != 0);
	}

}
