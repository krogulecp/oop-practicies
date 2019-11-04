package pl.sages.craft.cleancode.dip;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        new SoccerGame(new Goalkeeper(), new Midfielder()).match();
    }
}
