package animals;
import participants.Participant;

public class Human extends Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Человек " + name + " успешно пробежал " + distance + " метров.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Человек " + name + " успешно перепрыгнул " + height + " метров.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог перепрыгнуть " + height + " метров.");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}