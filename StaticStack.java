public class StaticStack {

    public static void main(String[] args) {
        StaticStack stack = new StaticStack();
        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(70);
        stack.push(60);
        stack.push(90);
        // System.out.println(stack);
        stack.printStack();
        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // This will result in stack underflow
    }


    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack
    public StaticStack() {
        stackArray = new int[MAX_SIZE];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int element) {
        // Check for stack overflow
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow! Cannot push element: " + element);
            return;
        }
        // Increment top and insert the element
        stackArray[++top] = element;
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public int pop() {
        // Check for stack underflow
        if (top == -1) {
            System.out.println("Stack underflow! Cannot pop element.");
            return -1; // Return a default value indicating underflow
        }
        // Get the element at the top and decrement top
        int element = stackArray[top--];
        System.out.println("Popped element: " + element);
        return element;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == MAX_SIZE - 1);
    }

    public void printStack() {
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
