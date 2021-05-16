public class Wall implements Obstacles{
    double heightWall;

    public Wall(double heightWall) {
        this.heightWall = heightWall;
    }


    @Override
    public String check(Participants participant) {
        System.out.println(participant.jumping());
        if(participant.getHeight() >= heightWall)
            return "Participant " + participant.getName() + " takes the height: " + heightWall;
        else
            return "Participant " + participant.getName() + " no takes the height: " + heightWall;
    }
}
