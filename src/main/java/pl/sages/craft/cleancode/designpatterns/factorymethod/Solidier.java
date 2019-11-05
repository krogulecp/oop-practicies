package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Solidier extends Enemy {
    private static final String NAME = "Solidier";
    private static final int POWER = 45;
    public Solidier() {
        super(NAME, POWER);
    }
}
