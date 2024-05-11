import java.util.ArrayDeque;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {

        //FIFO - first input, first output

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(5);
        queue.add(6);
        // -> 6,5,10 ->
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //Deque

    }
}
