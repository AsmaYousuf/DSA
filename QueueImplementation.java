/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicesession;

/**
 *
 * @author Asma
 */
public class QueueImplementation {

    int[] queue;
    int rear, front;
    int capacity;

    QueueImplementation(int c) {
        front = rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqueue(int item) {
        // check for overflow
        if (isfull()) {
            System.out.println("Queue is full:");
        } else {
            // check if queue is empty
            if (rear == -1 && front == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1); // increment rear by 1
            }
            queue[rear] = item;
            System.out.println("Element enqueue on Queue is :" + item);
        }
    }

    public int dequeue() {
        int item = 0;

        if (isempty()) {
            System.out.println("Queue is empty:");
        } else {
            item = queue[front];
            System.out.println("Element dequeue from Queue is :" + item);

            if (front == rear) {// check if only one item is left
//                front = -1; // after delete it queue becomes empty
//                rear = -1;
            } else {
                front = front + 1;
            }
        }
        return item;
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(4);
        queue.dequeue();
        System.out.println("--------------");

        queue.enqueue(34);
        queue.enqueue(3);
        queue.enqueue(23);
        queue.enqueue(33);
        queue.enqueue(1);
        System.out.println("--------------");
        queue.dequeue();
        queue.dequeue();
        
        queue.enqueue(11);

//       queue.peek();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println("--------------");

    }

    // print queue elements
    public void queueDisplay() {
        int i;
        if (isempty()) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i <= rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public boolean isfull() {
        return rear == capacity - 1;
    }

    public boolean isempty() {
        return front == -1;
    }

    // print front of queue
    public void peek() {
        if (isempty()) {
            System.out.println("\nQueue is Empty\n");
        } else {
            System.out.println("\nFront Element is: " + queue[front]);
        }
    }
}
