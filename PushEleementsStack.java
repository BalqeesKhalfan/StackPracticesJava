import java.util.Stack;

public class PushEleementsStack {
    public static  void main(String[] args){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);//add element 1
        System.out.println("Stack affter 2  :"+myStack);
        myStack.push(7);//add element 2
        System.out.println("Stack affter 7  :"+myStack);
        myStack.push(9);//add element 3
        System.out.println("Stack affter 9  :"+myStack);
    }
}
