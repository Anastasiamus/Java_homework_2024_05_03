package homework_2024_05_03_exc2_Passenger;

import java.util.LinkedList;
import java.util.Queue;

public class BoardingQueue {
    public static void main(String[] args) {

        Queue<Passenger> passengerQueue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            passengerQueue.add(new Passenger(i, i <=3));
        }
        System.out.println(" ");
        System.out.println("Boarding Queue:");

        passengerQueue.stream()
                .forEach(passenger -> {
                    String message = passenger.isFirstClass() ? "First class passenger" : "Passenger";
                    System.out.println(message + " " + passenger.getId() + " : Welcome on board!");
                });
    }
}



 /*2)Имеется очередь пассажиров(класс Passenger), часть из которых является клиентами 1 ого класса, которые, должны идти на посадку первыми.
        Написать приложение, которое создаст 10 пассажиров, из них 3 пассажира 1 ого класса.
        Отправить всех в одну очередь, разбирать очередь пока она не станет пустая.
        Пассажиры 1 ого класса должны быть в очереди первыми.*/