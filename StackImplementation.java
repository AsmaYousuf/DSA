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
public class StackImplementation {

    int size;
    int top;
    int arr[];
    
    // constructor having size as parameter
    public StackImplementation(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
        }

// this method inserts an element on stack
    public void push(int element) {
        if (!isStackFull()) {
            top++;
            arr[top] = element;
            System.out.println("Element Pushed on Stack is :" + element);
        } else {
            System.out.println("Cannot insert Stack is full...");
        }
    }

    // this method deletes an element from stack
    public int pop() {
        if (!isEmpty()) {
            int returnedtopElement = top;
            top--;
            System.out.println("Element Popped from Stack is :" + arr[returnedtopElement]);
            return arr[returnedtopElement];
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    // this method returns topmost element from stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    // this method checks stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
  
    // this method checks stack is full
    public boolean isStackFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(4);// constuctor call
        stack.pop();//
        System.out.println("--------------");
        stack.push(12);
        stack.push(1);
        stack.push(5);
        stack.push(8);
        stack.push(21);
        System.out.println("------------------");
        stack.pop();//21
        stack.pop();//8
        stack.pop();//5
        
        int i = stack.peek();//5
        System.out.println("----------------------"+ i);
    }

}
