package com.stack;

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
