import participants.Participant;
import animals.Cat;
import animals.Human;
import animals.Robot;
import obstacles.Treadmill;
import obstacles.Wall;
import obstacles.Obstacle;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Treadmill(5000),
                new Wall(2)
        };

        Participant[] participants = {
                new Human("Иван", 5000, 2),
                new Cat("Барсик", 1000, 3),
                new Robot("R2D2", 10000, 1)
        };

        for (Participant participant : participants) {
            System.out.println("Участник " + participant.getName() + " готов к старту!");
            boolean success = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    success = participant.run(obstacle.getValue());
                } else if (obstacle instanceof Wall) {
                    success = participant.jump(obstacle.getValue());
                }
                if (!success) {
                    System.out.println("Участник " + participant.getName() + " выбыл из соревнования.");
                    break;
                }
            }
            if (success) {
                System.out.println("Участник " + participant.getName() + " успешно прошел все испытания!");
            }
            System.out.println();
        }
    }
}