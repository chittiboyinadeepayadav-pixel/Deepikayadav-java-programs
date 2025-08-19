// Simple Queue implementation in Java
public class SimpleQueue {

    int size = 5;         // maximum size of queue
    int front = 0;        // points to first element
    int rear = -1;        // points to last element
    int count = 0;        // number of elements in queue
    int[] queue = new int[size];

    // Enqueue (insert element at rear)
    void enqueue(int value) {
        if (count == size) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % size;  // circular increment
            queue[rear] = value;
            count++;
            System.out.println("Enqueued: " + value);
        }
    }

    // Dequeue (remove element from front)
    void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % size;  // circular increment
            count--;
        }
    }

    // Display queue
    void display() {
        if (count == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % size;
                System.out.print(queue[index] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();    // Queue: 10 20 30

        q.dequeue();    // Dequeued: 10
        q.display();    // Queue: 20 30
    }
}
