
public class Treadmill implements Obstacles{
    private int distanceTreadmill;

    public Treadmill(int distanceTreadmill) {
        this.distanceTreadmill = distanceTreadmill;
    }

    @Override
    public String check(Participants participant) {
        System.out.println(participant.running());
        if (participant.getDistance() >= distanceTreadmill)
        return "Participant " + participant.getName() + " walked the distance: " + distanceTreadmill;
        else
            return "Participant " + participant.getName() + " no walked the distance: " + distanceTreadmill;
    }
}
