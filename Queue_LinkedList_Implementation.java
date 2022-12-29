/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListCode;

/**
 *
 * @author Asma
 */
public class Queue_LinkedList_Implementation {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int item = head.data;
        head = head.next;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }


public static void main(String[] args) {
        Queue_LinkedList_Implementation queue = new Queue_LinkedList_Implementation();
        queue.enqueue(23);
        queue.enqueue(33);
        queue.enqueue(43);
        queue.enqueue(53);
        
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.dequeue();
        }
    }

}
