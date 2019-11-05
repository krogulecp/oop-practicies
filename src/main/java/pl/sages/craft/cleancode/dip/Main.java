package pl.sages.craft.cleancode.dip;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {

        List<SoccerPlayer> players = new ArrayList<>();
        players.add(new Goalkeeper());
        players.add(new Midfielder());

        new SoccerGame(players).match();
    }
}
