import java.util.Stack;

public class ExampleStackTwo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // push - add element to stack
        stack.push("Hello");
        stack.push("QA");
        stack.push("Class");

        /*
        Class
        QA
        Hello
         */
        System.out.println(stack);


        //peek- get element from top of the stack
        String elementFromTop = stack.peek();

        System.out.println("The element at the top of the stack is : " + stack.peek());
        System.out.println("The element at the top of the stack is : " + stack.peek());
        System.out.println("The element at the top of the stack is : " + stack.peek());

        //pop - get element from top of the stack and remove it
        String element = stack.pop();
        System.out.println("The element at the top(with remove) of the stack is : " + element);

        System.out.println("The element at the top of the stack is : " + stack.peek());
        System.out.println("The element at the top of the stack is : " + stack.peek());
        stack.pop();

        System.out.println("The element at the top of the stack is : " + stack.peek());
















    }
}
