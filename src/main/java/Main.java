public class Main {
    public static void main(String[] args) {

        Participants[] participants = {
                new Human("Boriya", 500, 2),
                new Human("Misha", 1500, 1.5),
                new Cat("Gena", 200, 1.8),
                new Cat("Mursik", 150, 1.6),
                new Robot("Optimus", 30000, 10.5),
                new Robot("Wally", 70000, 15.7)
        };

        Obstacles[] obstacles = {
          new Treadmill(200),
          new Treadmill(1500),
          new Wall(1.5),
          new Wall(14)
        };

        for (int i = 0; i < obstacles.length; i++) {
            for (Participants participant : participants) {
                    System.out.println(obstacles[i].check(participant));
            }
        }

    }
}
