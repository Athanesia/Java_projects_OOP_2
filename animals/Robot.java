package animals;
import participants.Participant;

public class Robot extends Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот " + name + " успешно пробежал " + distance + " метров.");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот " + name + " успешно перепрыгнул " + height + " метров.");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог перепрыгнуть " + height + " метров.");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}