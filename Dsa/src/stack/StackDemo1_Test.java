package stack;

import java.util.Scanner;

public class StackDemo1_Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StackDemo1 stack = new StackDemo1(); 
        stack.create_Stack(5); // Initialize stack size

        int ch;
        do {
            System.out.println("Stack Menu");
            System.out.println("--------------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print All Elements");
            System.out.println("5. Exit");
            System.out.println("---------------------");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int element = sc.nextInt();
                    if (!stack.is_Full()) {
                        stack.push(element);
                    } else {
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element is: " + topElement);
                    }
                    break;
                case 4:
                    stack.print_Stack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                    
                   
            }
        } while (ch != 5);

        sc.close(); // Close the scanner
    }
}
