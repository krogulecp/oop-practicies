package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
abstract class Enemy {
    private final String name;
    private final int power;

    public Enemy(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
