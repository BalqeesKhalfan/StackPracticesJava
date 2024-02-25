import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a string containing only parentheses: ");
        String userInput=scanner.nextLine();
        System.out.println("Input string is balanced: " + isBalanced(userInput));
    }
    public static  boolean isBalanced(String userInput){
        Stack<Character> myStack=new Stack<>();
        for (char c : userInput.toCharArray()) {
            if (c == '(' ) {
                // If an opening parenthesis is encountered, push it onto the stack
                myStack.push(c);
            } else if (c == ')' ) {
                // If a closing parenthesis is encountered, check if the stack is empty
                // If it's empty, then there is no matching opening parenthesis, so return false
                if (myStack.isEmpty()) {
                    return false;
                }
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }

    }

