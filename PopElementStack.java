
/*
* Problem Statement: Assuming you have a stack with some integers, write a function to remove (or "pop") an element from the stack. Print the element that was removed and the current stack contents.

Objective: Learn how elements are removed from a stack and how the LIFO principle works.
* */
import java.util.Stack;

public class PopElementStack {
    public static void main(String[] args) {
        // Initialize a stack and push some integers onto it
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);//add element 1
        System.out.println("Stack affter 2  :"+myStack);
        myStack.push(7);//add element 2
        System.out.println("Stack affter 7  :"+myStack);
        myStack.push(9);//add element 3
        System.out.println("Stack affter 9  :"+myStack);

        // Pop an element from the stack
        int removedElement = myStack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack affter pop  :"+myStack);


}
}
