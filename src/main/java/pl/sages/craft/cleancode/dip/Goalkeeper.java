package pl.sages.craft.cleancode.dip;

/**
 * @author krogulecp
 */
class Goalkeeper implements SoccerPlayer {
    void protectGoal(){
        System.out.println("Keeper protecting goal");
    }

    @Override
    public void play() {
        protectGoal();
    }
}
