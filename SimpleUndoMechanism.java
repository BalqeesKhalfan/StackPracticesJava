import java.util.Stack;
import  java.util.Scanner;
public class SimpleUndoMechanism {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> undoStack = new Stack<>();
        System.out.println("Type characters (press 'undo' to undo):");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("undo")) {
                // User wants to undo the last character
                if (!undoStack.isEmpty()) {
                    undoStack.pop();
                }
            } else {
                // User types a character, push it onto the stack
                for (char c : userInput.toCharArray()) {
                    undoStack.push(c);
                }
            }

            // Print the current state of the text
            printText(undoStack);
        }
    }
    private static void printText(Stack<Character> undoStack) {
        System.out.print("Current text: ");
        for (char c : undoStack) {
            System.out.print(c);
        }
        System.out.println();
    }

    }

