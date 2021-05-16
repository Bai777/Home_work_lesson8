
public class Treadmill implements Obstacles{
    private int distanceTreadmill;

    public Treadmill(int distanceTreadmill) {
        this.distanceTreadmill = distanceTreadmill;
    }

    @Override
    public String check(Participants participant) {
        System.out.println(participant.running());
        participant.setFlag(participant.getDistance() >= distanceTreadmill);
        if (participant.getFlag()) {
            participant.setFlag(true);
            return "Participant " + participant.getName() + " walked the distance: " + distanceTreadmill;
        }
        else {
            participant.setFlag(false);
            return "Participant " + participant.getName() + " no walked the distance: " + distanceTreadmill;
        }
    }
}
