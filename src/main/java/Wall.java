public class Wall implements Obstacles {
    double heightWall;

    public Wall(double heightWall) {
        this.heightWall = heightWall;
    }


    @Override
    public String check(Participants participant) {
        System.out.println(participant.jumping());

        participant.setFlag(participant.getHeight() >= heightWall);
        if (participant.getFlag()) {
            participant.setFlag(true);
            return "Participant " + participant.getName() + " takes the height: " + heightWall;
        } else {
            participant.setFlag(false);
            return "Participant " + participant.getName() + " no takes the height: " + heightWall;
        }
    }
}
