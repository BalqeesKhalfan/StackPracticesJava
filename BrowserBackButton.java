import java.util.Scanner;
import java.util.Stack;

public class BrowserBackButton {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        while (true) {
            System.out.println("Enter a URL (type 'back' to go back, 'exit' to quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("back")) {
                if (!history.isEmpty()) {
                    String previousPage = history.pop();
                    System.out.println("Going back to: " + previousPage);
                } else {
                    System.out.println("No history to go back.");
                }
            } else {
                // Visiting a new page, so push it onto the stack
                history.push(input);
                System.out.println("Visited: " + input);
            }
        }


    }
}