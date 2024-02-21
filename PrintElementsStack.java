/*Problem Statement: Write a function to print all elements in a stack from top to bottom. Ensure that the stack remains unchanged after printing.

Objective: Learn to access and display all elements in a stack.*/

import java.util.Stack;

public class PrintElementsStack {

    public static  void main(String[] args){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);//add element 1
        myStack.push(7);//add element 2
        myStack.push(9);//add element 3

        myStack.push(90);//add element 4
        myStack.push(117);//add element 5
        myStack.push(98);//add element 6

        // Print all elements in the stack from top to bottom
        printStackFromTop(myStack);
    }

    public static void printStackFromTop(Stack<Integer> myStack) {

        Object[] stackArray = myStack.toArray();

        // Print all elements in the array from top to bottom
        for (int i = stackArray.length - 1; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
