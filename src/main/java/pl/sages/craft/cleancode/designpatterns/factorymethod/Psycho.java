package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Psycho extends Enemy {
    private static final String NAME = "Psycho";
    private static final int POWER = 99;
    public Psycho() {
        super(NAME, POWER);
    }
}
