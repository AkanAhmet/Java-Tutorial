package com.akanahmet.collections.stack_impl;

public class StackTest {

    public static void main(String args[])
    {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is :" + stack.peek());
        System.out.print("Elements present in stack :");
        stack.print();
    }
}
