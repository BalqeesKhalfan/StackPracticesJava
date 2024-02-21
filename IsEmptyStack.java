/*
* Problem Statement: Write a function that checks whether a stack is empty and returns true if it is, or false otherwise. Test your function by checking an empty stack and a stack with elements.

Objective: Practice checking the state of a stack (empty or not).
* */

import java.util.Stack;

public class IsEmptyStack {
    public static void main(String[] args) {
        // Initialize a stack and push some integers onto it
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);//add element 1
        System.out.println("Stack affter 2  :"+myStack);
         System.out.println("Is Empty :"+myStack.empty());
         myStack.pop(); //remove the element to come empty
        System.out.println("Stack affter pop  :"+myStack);
         System.out.println("Is Empty : "+myStack.empty());



    }
}
