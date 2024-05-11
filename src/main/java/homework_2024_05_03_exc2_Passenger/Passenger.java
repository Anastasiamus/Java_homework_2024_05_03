package homework_2024_05_03_exc2_Passenger;

import java.util.Stack;

public class Passenger {
    private int id;
    private boolean FirstClass;

    public Passenger(int id, boolean isFirstClass) {
        this.id = id;
        this.FirstClass = isFirstClass;
    }

    public int getId() {
        return id;
    }

    public boolean isFirstClass() {
        return FirstClass;
    }
}


 /*2)Имеется очередь пассажиров(класс Passenger), часть из которых является клиентами 1 ого класса, которые, должны идти на посадку первыми.
        Написать приложение, которое создаст 10 пассажиров, из них 3 пассажира 1 ого класса.
        Отправить всех в одну очередь, разбирать очередь пока она не станет пустая.
        Пассажиры 1 ого класса должны быть в очереди первыми.*/