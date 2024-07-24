package io.murad.stack;

import java.util.logging.Logger;

public class Stack {
    Logger log = Logger.getLogger(Stack.class.getName());
    private final int[] arr;
    private int top;
    private final int capacity;

    // Creating a stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
        log.info("Top: " + top);
    }

    // Add Elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting Element: " + x);
        arr[++top] = x;
        log.info("inserted element Now: " + x);
//		System.out.println(++top);
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
//		System.out.println(top--);
        return arr[top--];
    }

    // Utility function to return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top >= capacity;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();

        System.out.println("\nAfter popping out");

        stack.peek();

        System.out.println("Size of Stack: " + stack.size());
        System.out.print("Stack: ");
        stack.printStack();
    }
}