package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Soldier extends Enemy {
    private static final String NAME = "Soldier";
    private static final int POWER = 45;
    public Soldier() {
        super(NAME, POWER);
    }
}
