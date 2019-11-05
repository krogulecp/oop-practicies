package pl.sages.craft.cleancode.dip;

import java.util.Arrays;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        new SoccerGame(Arrays.asList(new Goalkeeper(), new Midfielder())).match();
    }
}
