package dsaQuestion;

import java.util.Scanner;
import queue.QueueDemo1;

public class Queue_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_Binary binary = new Queue_Binary();
        QueueDemo1 q1 = new QueueDemo1();

        int dec = 0;
        int power = 0;

        System.out.print("Enter the size of binary data: ");
        int size = sc.nextInt();

        q1.create_Queue(size);

        System.out.println("Enter binary data:");
        for (int i = 0; i < size; i++) {
            int digit = sc.nextInt();
            q1.Enqueue(digit); // Enqueue each binary digit
        }

        while (!q1.is_Empty()) {
            int digit = q1.Dequeue();
            dec += digit * Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal value: " + dec);
    }
}
