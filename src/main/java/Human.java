public class Human implements Participants {

    private String name;
    private int distance;
    private double height;


    public Human(String name, int distance, double height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public String running(){
        return name + " can running: " + this.distance;
    }

    @Override
    public String jumping(){
        return name + " can jumping: " + this.height;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public double getHeight() {
        return height;
    }

}
