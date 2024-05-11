import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            queue.add(random.nextInt(100));
        }
        System.out.println(queue);


        for (int i = 0; i < 10; i++) {
            Integer element = queue.poll();
            System.out.print("Element = " + element + " " + queue);
            System.out.println();
        }
    }
}
