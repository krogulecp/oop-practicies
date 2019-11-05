package pl.sages.craft.cleancode.dip;

/**
 * @author krogulecp
 */
class Midfielder implements SoccerPlayer {
    void playInMidfield(){
        System.out.println("Soccer player plays in midfield");
    }

    @Override
    public void play() {
        playInMidfield();
    }
}
