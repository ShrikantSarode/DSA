package queue;

public class Priority_Queue_Class
{
    private int Q[], MaxSize, front,rear;

    public void create_Queue(int size) {
        MaxSize = size;//init MaxSize
        front = 0;
        rear=-1;
        Q= new int[size];//create queue

    }

    void Enqueue(int e) {
        rear++;
        Q[rear]=e;
        System.out.println("Element " + e + " Inserted in Queue");
        for(int i=front;i<rear;i++)
        {
            for(int j=front;j<rear;j++)
            {
                if(Q[j]>Q[j+1])//ASC
                    //if(Q[j]<Q[j+1])//DESC
                {
                    int temp=Q[j];
                    Q[j]=Q[j+1];
                    Q[j+1]=temp;
                }
            }
        }
    }

    boolean is_Full() {
        if (rear == MaxSize - 1)
            return true;
        else
            return false;
    }

    int Dequeue() {
        int temp = Q[front];
        front++;
        return (temp);
    }

    boolean is_Empty() {
        if (front>rear)
            return true;
        else
            return false;
    }

    void print_Queue() {//lifo print
        System.out.println("Queue has");
        for (int i = front; i <=rear; i++) {
            System.out.print(Q[i]+"--");
        }

    }
}
