import java.util.Stack;

public class ClearStack {
    public static void main(String[] args){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(6);
        myStack.push(5);
        myStack.push(98);
        myStack.push(8);
        myStack.push(3);
        myStack.push(1);
        System.out.println("Stack elements before clear :"+myStack);

        clearStack(myStack);
        System.out.println("Stack elements after clear :"+myStack);

    }

    public static void  clearStack(Stack<Integer> myStack){
      if(myStack.isEmpty()){
          System.out.println("Stack is alreay empty ");
          return;
      }
      while (!myStack.isEmpty()){
          myStack.pop();

      }

      System.out.println("Stack cleared successfully");
    }
}
