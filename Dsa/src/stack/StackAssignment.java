package stack;

import java.util.Scanner;

class StackAssignment {
    private int[] arr;
    private int t1, t2;
    private int size;

    public StackAssignment(int size) {
        this.size = size;
        arr = new int[size];
        t1 = -1;
        t2 = size;
    }

    public void push1(int val) {
        if (t1 < t2 - 1) {
            t1++;
            arr[t1] = val;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    public void push2(int val) {
        if (t1 < t2 - 1) {
            t2--;
            arr[t2] = val;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public int pop1() {
        if (t1 >= 0) {
            int val = arr[t1];
            t1--;
            return val;
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (t2 < size) {
            int val = arr[t2];
            t2++;
            return val;
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }

    public int peek1() {
        if (t1 >= 0) {
            return arr[t1];
        } else {
            System.out.println("Stack 1 is empty");
            return -1;
        }
    }

    public int peek2() {
        if (t2 < size) {
            return arr[t2];
        } else {
            System.out.println("Stack 2 is empty");
            return -1;
        }
    }

    public boolean isEmpty1() {
        return t1 == -1;
    }

    public boolean isEmpty2() {
        return t2 == size;
    }

    public void display() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= t1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Stack 2: ");
        for (int i = t2; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int size = sc.nextInt();
        StackAssignment stacks = new StackAssignment(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Pop from Stack 1");
            System.out.println("3. Peek at Stack 1");
            System.out.println("4. Check if Stack 1 is empty");
            System.out.println("5. Push to Stack 2");
            System.out.println("6. Pop from Stack 2");
            System.out.println("7. Peek at Stack 2");
            System.out.println("8. Check if Stack 2 is empty");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push to Stack 1: ");
                    int val1 = sc.nextInt();
                    stacks.push1(val1);
                    break;
                case 2:
                    System.out.println("Popped from Stack 1: " + stacks.pop1());
                    break;
                case 3:
                    System.out.println("Peek at Stack 1: " + stacks.peek1());
                    break;
                case 4:
                    System.out.println("Is Stack 1 empty? " + stacks.isEmpty1());
                    break;
                case 5:
                    System.out.print("Enter value to push to Stack 2: ");
                    int val2 = sc.nextInt();
                    stacks.push2(val2);
                    break;
                case 6:
                    System.out.println("Popped from Stack 2: " + stacks.pop2());
                    break;
                case 7:
                    System.out.println("Peek at Stack 2: " + stacks.peek2());
                    break;
                case 8:
                    System.out.println("Is Stack 2 empty? " + stacks.isEmpty2());
                    break;
                case 9:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

            stacks.display();
        }
    }
}


