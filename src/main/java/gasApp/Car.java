package gasApp;

public class Car {

    private int rank;

    private int code;

    public Car(int rank, int code) {
        this.rank = rank;
        this.code = code;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Carcode" + code + " + rank";

    }
}
