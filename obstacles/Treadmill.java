package obstacles;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getValue() {
        return length;
    }
}