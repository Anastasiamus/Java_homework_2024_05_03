package gasApp;

import java.util.PriorityQueue;
import java.util.Queue;

public class GasStationApp {
    public static void main(String[] args) {

        Queue<Car> gasStationQueue = new PriorityQueue<>(new CarComparator());
        for (int i = 0 ; i < 100; i++) {
            int rank = 100;
            if (i % 10 == 0) {
                rank = 50;
            }
            Car currentCar = new Car(rank, i);
            gasStationQueue.add(currentCar);
        }

        System.out.println(gasStationQueue);

        for (int i = 0; i < 100; i++) {
            Car currentCar = gasStationQueue.poll();
            System.out.println("Car " + currentCar + " is done");
        }
    }
}
