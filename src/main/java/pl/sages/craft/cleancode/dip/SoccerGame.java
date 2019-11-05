package pl.sages.craft.cleancode.dip;

import java.util.List;

/**
 * @author krogulecp
 */
class SoccerGame{
    private final List<SoccerPlayer> players;

    public SoccerGame(List<SoccerPlayer> players) {
        this.players = players;
    }

    void match(){
        players.forEach(SoccerPlayer::play);
    }
}
