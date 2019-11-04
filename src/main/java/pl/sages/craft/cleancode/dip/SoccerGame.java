package pl.sages.craft.cleancode.dip;

/**
 * @author krogulecp
 */
class SoccerGame {
    private final Goalkeeper goalkeeper;
    private final Midfielder midfielder;

    public SoccerGame(Goalkeeper goalkeeper, Midfielder midfielder) {
        this.goalkeeper = goalkeeper;
        this.midfielder = midfielder;
    }

    void match(){
        goalkeeper.protectGoal();
        midfielder.playInMidfield();
    }
}
