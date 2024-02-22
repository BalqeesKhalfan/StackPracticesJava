import java.util.Scanner;
import java.util.Stack;

public class ReverseOrder {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Enter Number of Elements Stack :");
        int N=scanner.nextInt();
        System.out.println("Enter " + N + " numbers:");

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            myStack.push(num); // Push each number onto the stack
        }
        System.out.println("Numbers in reverse order:");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }
}
