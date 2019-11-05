package pl.sages.craft.cleancode.dip;

/**
 * @author krogulecp
 */
class Goalkeeper implements SoccerPlayer {
    @Override
    public void play() {
        System.out.println("Keeper protecting goal");
    }
}
