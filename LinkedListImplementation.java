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
public class LinkedListImplementation {

    Node head;
    int size;

    public LinkedListImplementation() {
        size = 0;
    }

    public class Node {

        String data; // variable containing the data of the node
        Node next; // variable containing the address of next node

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node current = head.next;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = null;
        head = prev;
    }

    public void insertAtStart(String data) {
        Node newNode = new Node(data);// creating new node of linked list

        if (head == null) { // check if linked list is empty
            head = newNode;
            return;
        }
        newNode.next = head;// inserting the node at the beginning
        head = newNode;

    }

    public void insertAtEnd(String data) {
        Node newNode = new Node(data);// creating new node of linked list

        if (head == null) { // check if linked list is empty
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;// inserting the node at the end
    }

    public void deleteStart() {
        if (head == null) { // check if linked list is empty
            System.out.println("Linked List is empty:");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) { // check if linked list is empty
            System.out.println("Linked List is empty:");
            return;
        }

        size--;

        if (head.next == null) { // if linked list contain only one node or single element.
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }

        secondLastNode.next = null;

    }

    public int getSize() {
        return size;
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
        LinkedListImplementation list = new LinkedListImplementation();
        list.insertAtEnd("I");
        list.insertAtEnd("am");
        list.insertAtEnd("asma");
        list.printList();
        list.insertAtStart("Hey!");
        list.printList();
        list.insertAtEnd("qaiser");
        list.printList();

        list.reverse();
        list.printList();
        
        list.deleteLast();
        list.printList();
        list.deleteStart();
        list.printList();
        System.out.println("Size of the linked list is:" + list.getSize());

    }
}
