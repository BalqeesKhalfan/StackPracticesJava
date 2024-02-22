import java.util.Stack;

public class CountStackElements {


    public static void main(String[] args) {
        // Create a stack and add some elements
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);//add element 1
        myStack.push(7);//add element 2
        myStack.push(9);//add element 3
        myStack.push(90);//add element 4
        myStack.push(117);//add element 5
        myStack.push(98);//add element 6//

        // Call the countElements method to count the elements in the stack
        int result = countElements(myStack);

        // Print the number of elements in the stack
        System.out.println("Number of elements in the stack: " + result);


    }
    // Method to count the number of elements in the stack without removing any
    public static int countElements(Stack<Integer> stack) {
        // Create a temporary stack to hold elements while counting
        Stack<Integer> tempStack = new Stack<>();

        // Move elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop()); // Push each element from the original stack to the temporary stack
        }

        // Count the number of elements in the temporary stack
        int count = tempStack.size();

        // Move the elements back to the original stack (restore the original stack)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); // Push each element from the temporary stack back to the original stack
        }

        // Return the count of elements
        return count;
    }
}
