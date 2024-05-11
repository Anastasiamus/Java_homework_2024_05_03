import java.util.Stack;

public class ExampleTaskOne {

    public static void main(String[] args) {

        String text = "abbadbceecbf";
        //aadbccbf
        //dbbf
        //df

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i); //a,b,b
            if (!stack.isEmpty() && stack.peek() == temp) {
                stack.pop();
            } else {
                stack.push(temp);
            }

             /* if (stack.isEmpty()){
                 stack.push(temp); //a
             } else {
                 if (stack.peek() == temp) { // a==b, b==b
                     stack.pop(); //a
                 } else {
                     stack.push(temp); //a,b
                 }
             } */
        }
        System.out.println(stack);
    }
}



