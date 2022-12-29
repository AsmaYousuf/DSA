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
public class DoublyLinkedList {

    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public class Node {

        String data;
        Node next;
        Node previous;

        public Node(String data) {
            this.data = data;
        }
    }

    public void insertStart(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;// assign null to next of newNode            
            newNode.previous = null;// assign null to prev of newNode
            head = newNode;            // head points to newNode
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        newNode.previous = null;     // assign null to prev of newNode   
        head = newNode;// head points to newNode
    }

    public void insertEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        newNode.next = null;
        newNode.previous = currentNode;
        currentNode.next = newNode;
    }

    public void deleteStart() {
        if (head == null) { // check if linked list is empty
            System.out.println("Linked List is empty:");
            return;
        }

        head = head.next;
        head.previous = null;
    }

    public void deleteEnd() {
        if (head == null) { // check if linked list is empty
            System.out.println("Linked List is empty:");
            return;
        }
        if (head.next == null) { // if linked list contain only one node or single element.
            head = null;
            return;
        }

       Node previousNode = head;
       Node currNode = head.next;

        while (currNode.next != null) {
            previousNode = previousNode.next;
            currNode = currNode.next;
        }

        previousNode.next = null;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertStart("asma");
        list.insertStart("am");
        list.insertStart("I");

        list.printList();

        list.insertEnd("qaiser");

        list.printList();

        list.deleteStart();
        list.printList();

        list.deleteEnd();
        list.printList();
    }
}
