package com.stack;


public class Stack {
    private static int top = 0;
    private static int[] a = new int[10];

    public void isEmpty() {
        if (top < 1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack have Value");
        }
    }


    public void push(int value) {
        int length = a.length;
        if (top < length) {
            int next = ++top;
            a[next] = value;
            System.out.println(value + " Push Stack");
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Can't pop  because stack dont have value");
        } else {
            a[top] = 0;
            int value = a[top--];
        }
    }

    public void peek() {
        if (top == 0) {
            System.out.println("Can't peek because stack dont have Value");
        } else {
            int value = a[top++];
            System.out.println(value + " Peek from Stack");
        }
    }

    public void printStack() {
        if (top < 1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = a.length - 1; i > 0; i--) {
                System.out.println(i + " = " + a[i]);
            }
        }
    }
}

class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        System.out.println("********************************");
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        System.out.println("********************************");
        System.out.println("Stack is empty value ? ");
        s.isEmpty();
        System.out.println("********************************");
        System.out.println("list Stack");
        s.printStack();
    }


}
